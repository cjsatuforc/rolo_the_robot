/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.rolo.the.robot.mind.listeners;

import com.salaboy.rolo.events.ExternalNotificationEvent;
import com.salaboy.rolo.events.MindNotificationEvent;
import com.salaboy.rolo.events.MindUpdateEvent;
import com.salaboy.rolo.events.ReadSonarsEvent;
import com.salaboy.rolo.events.RobotPartAddedEvent;
import com.salaboy.rolo.model.reports.SonarsReport;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.commons.io.IOUtils;
import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.builder.model.KieSessionModel;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.conf.ClockTypeOption;
import org.kie.api.runtime.rule.EntryPoint;


/**
 *
 * @author salaboy This listener is intended to wrap the Knowledge Session used
 * to assist the robot in making decisions It consumes (Observes) already
 * processed events, meaning that it doesn't care about low level hardware
 * notifications
 *
 * The internal session generates Mind Notifications, which are some kind of
 * suggestions to act on. It also has direct access to body parts to control
 * directly
 */
@Singleton
public class RobotKnowledgeListener {

    private KieSession rolo;
    
    private KieFileSystem newKieFileSystem;
    
    private KieServices kieServices = KieServices.Factory.get();

    @Inject
    private Event<MindNotificationEvent> mindNotifications;

    @Inject
    private Event<ExternalNotificationEvent> externalNotifications;

    public RobotKnowledgeListener() {
    }

    @PostConstruct
    private void init() {

        KieModuleModel kieModuleModel = kieServices.newKieModuleModel();

        KieBaseModel kieBaseModel1 = kieModuleModel.newKieBaseModel("KBase1 ")
                .setDefault(true)
                .setEqualsBehavior(EqualityBehaviorOption.EQUALITY)
                .setEventProcessingMode(EventProcessingOption.STREAM);

        KieSessionModel ksessionModel1 = kieBaseModel1.newKieSessionModel("KSession1")
                .setDefault(true)
                .setType(KieSessionModel.KieSessionType.STATEFUL)
                .setClockType(ClockTypeOption.get("realtime"));

        newKieFileSystem = kieServices.newKieFileSystem();
        newKieFileSystem.write("src/main/resources/KBase1/base.drl", kieServices.getResources().newClassPathResource( "base.drl" ));
        newKieFileSystem.writeKModuleXML(kieModuleModel.toXML());
        kieServices.newKieBuilder( newKieFileSystem ).buildAll();

        createRolo();

    }
    
    private void createRolo(){
        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
        rolo = kieContainer.newKieSession("KSession1");
        
        rolo.setGlobal("notifications", mindNotifications);
        rolo.setGlobal("external", externalNotifications);
        new Thread(new Runnable() {
            public void run() {
                rolo.fireUntilHalt();
            }
        }).start();
    }

    private void update(@Observes MindUpdateEvent event) throws IOException {
        rolo.dispose();
        rolo = null;
        InputStream inputStream = kieServices.getResources().newClassPathResource( "base.drl" ).getInputStream();
        StringWriter writer = new StringWriter();
        IOUtils.copy(inputStream, writer);
        String theString = writer.toString();
        theString += event.getContent();
        
        System.out.println("Updating Rules: "+ theString);
        newKieFileSystem.write("src/main/resources/KBase1/base.drl", theString);
        
        kieServices.newKieBuilder( newKieFileSystem ).buildAll();
        createRolo();
    }

    public void onRobotPartAddedEvent(@Observes RobotPartAddedEvent event) {
        if(rolo != null){
            rolo.insert(event.getRobotPart());
        }

    }

    public void onReadSensor(@Observes ReadSonarsEvent event) {
        if(rolo != null){
            EntryPoint entryPoint = rolo.getEntryPoint("distance-sensor");
            if (entryPoint != null) {
                entryPoint.insert(new SonarsReport(event.getFront(), event.getRight(), event.getLeft(), event.getBack()));

            } else {
                System.out.println(">>> Rolo Mind: I've recieved a " + event + "but I don't know what to do with it");
            }
        }else{
                System.out.println(">>> Rolo Mind: I've recieved a " + event + "but I don't know what to do with it (rolo restarting probably)");
        }
    }

}
