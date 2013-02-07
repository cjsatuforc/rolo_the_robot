/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.rolo.hardware.test.ui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author salaboy
 */
public class HardwareTestUIJFrame extends javax.swing.JFrame {

    private RoloClientConnector roloClientConnector;
    private boolean connected = false;
    /**
     * Creates new form RoloUIJFrame
     */
    public HardwareTestUIJFrame() {
        initComponents();
        roloClientConnector = new RoloClientConnector("rolo-ui", new CommandClientHandler(this));
        
        
        
        
    }

    public JTextArea getNotificationjTextArea() {
        return notificationjTextArea;
    }

    public JTextField getDistancejTextField() {
        return distancejTextField;
    }

    public JTextField getLightjTextField() {
        return lightjTextField;
    }

    public JTextField getTouchjTextField() {
        return touchjTextField;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     * 
     */
    
    
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    backwardAjButton = new javax.swing.JButton();
    forwardAjButton = new javax.swing.JButton();
    stopAjButton = new javax.swing.JButton();
    motorAjSlider = new javax.swing.JSlider();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    notificationjTextArea = new javax.swing.JTextArea();
    jPanel3 = new javax.swing.JPanel();
    serverAddressjTextField = new javax.swing.JTextField();
    connectjButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    statusjLabel = new javax.swing.JLabel();
    localjCheckBox = new javax.swing.JCheckBox();
    jPanel4 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    distancejTextField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    lightjTextField = new javax.swing.JTextField();
    touchjTextField = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jPanel5 = new javax.swing.JPanel();
    backwardCjButton1 = new javax.swing.JButton();
    forwardCjButton1 = new javax.swing.JButton();
    stopCjButton1 = new javax.swing.JButton();
    motorCjSlider = new javax.swing.JSlider();
    jPanel6 = new javax.swing.JPanel();
    backwardBjButton2 = new javax.swing.JButton();
    forwardBjButton2 = new javax.swing.JButton();
    stopBjButton2 = new javax.swing.JButton();
    motorBjSlider = new javax.swing.JSlider();
    jPanel7 = new javax.swing.JPanel();
    backwardGlobaljButton = new javax.swing.JButton();
    forwardGlobaljButton = new javax.swing.JButton();
    stopGlobaljButton = new javax.swing.JButton();
    motorGlobaljSlider = new javax.swing.JSlider();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Motor A"));

    backwardAjButton.setText("Backward");
    backwardAjButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backwardAjButtonActionPerformed(evt);
      }
    });

    forwardAjButton.setText("Forward");
    forwardAjButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        forwardAjButtonActionPerformed(evt);
      }
    });

    stopAjButton.setText("Stop");
    stopAjButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        stopAjButtonActionPerformed(evt);
      }
    });

    motorAjSlider.setMaximum(255);

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .add(forwardAjButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(backwardAjButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(stopAjButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(motorAjSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(forwardAjButton)
          .add(stopAjButton)
          .add(backwardAjButton))
        .add(214, 214, 214))
      .add(jPanel1Layout.createSequentialGroup()
        .add(motorAjSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(0, 0, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Notifications"));

    notificationjTextArea.setColumns(20);
    notificationjTextArea.setRows(5);
    jScrollPane1.setViewportView(notificationjTextArea);

    org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .add(jScrollPane1)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        .addContainerGap())
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

    serverAddressjTextField.setText("192.168.0.x");

    connectjButton.setText("Connect");
    connectjButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        connectjButtonActionPerformed(evt);
      }
    });

    jLabel1.setText("Status:");

    statusjLabel.setBackground(new java.awt.Color(153, 0, 0));
    statusjLabel.setForeground(new java.awt.Color(153, 0, 0));
    statusjLabel.setText("Disconnected");

    localjCheckBox.setText("Local?");
    localjCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        localjCheckBoxActionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel3Layout.createSequentialGroup()
        .add(18, 18, 18)
        .add(serverAddressjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(connectjButton)
        .add(18, 18, 18)
        .add(localjCheckBox)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(jLabel1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(statusjLabel)
        .add(67, 67, 67))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel3Layout.createSequentialGroup()
        .add(26, 26, 26)
        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(serverAddressjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(connectjButton)
          .add(jLabel1)
          .add(statusjLabel)
          .add(localjCheckBox))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sensors"));

    jLabel2.setText("Distance:");

    jLabel3.setText("Light:");

    jLabel4.setText("Touch:");

    org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .add(jLabel2)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(distancejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(34, 34, 34)
        .add(jLabel3)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(lightjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(21, 21, 21)
        .add(jLabel4)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(touchjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(21, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel4Layout.createSequentialGroup()
        .add(16, 16, 16)
        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel2)
          .add(distancejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(lightjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel3)
          .add(touchjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel4))
        .addContainerGap(21, Short.MAX_VALUE))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Motor C"));

    backwardCjButton1.setText("Backward");
    backwardCjButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backwardCjButton1ActionPerformed(evt);
      }
    });

    forwardCjButton1.setText("Forward");
    forwardCjButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        forwardCjButton1ActionPerformed(evt);
      }
    });

    stopCjButton1.setText("Stop");
    stopCjButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        stopCjButton1ActionPerformed(evt);
      }
    });

    motorCjSlider.setMaximum(255);

    org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel5Layout.createSequentialGroup()
        .add(forwardCjButton1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(backwardCjButton1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(stopCjButton1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(motorCjSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(16, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(forwardCjButton1)
          .add(stopCjButton1)
          .add(backwardCjButton1))
        .add(214, 214, 214))
      .add(jPanel5Layout.createSequentialGroup()
        .add(motorCjSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(0, 0, Short.MAX_VALUE))
    );

    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Motor B"));

    backwardBjButton2.setText("Backward");
    backwardBjButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backwardBjButton2ActionPerformed(evt);
      }
    });

    forwardBjButton2.setText("Forward");
    forwardBjButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        forwardBjButton2ActionPerformed(evt);
      }
    });

    stopBjButton2.setText("Stop");
    stopBjButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        stopBjButton2ActionPerformed(evt);
      }
    });

    motorBjSlider.setMaximum(255);

    org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel6Layout.createSequentialGroup()
        .add(forwardBjButton2)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(backwardBjButton2)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(stopBjButton2)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(motorBjSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(16, Short.MAX_VALUE))
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(forwardBjButton2)
          .add(stopBjButton2)
          .add(backwardBjButton2))
        .add(214, 214, 214))
      .add(jPanel6Layout.createSequentialGroup()
        .add(motorBjSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(0, 0, Short.MAX_VALUE))
    );

    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Global"));

    backwardGlobaljButton.setText("Backward");
    backwardGlobaljButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backwardGlobaljButtonActionPerformed(evt);
      }
    });

    forwardGlobaljButton.setText("Forward");
    forwardGlobaljButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        forwardGlobaljButtonActionPerformed(evt);
      }
    });

    stopGlobaljButton.setText("Stop");
    stopGlobaljButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        stopGlobaljButtonActionPerformed(evt);
      }
    });

    motorGlobaljSlider.setMaximum(255);

    org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel7Layout.createSequentialGroup()
        .add(forwardGlobaljButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(backwardGlobaljButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(stopGlobaljButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(motorGlobaljSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(forwardGlobaljButton)
          .add(stopGlobaljButton)
          .add(backwardGlobaljButton))
        .add(214, 214, 214))
      .add(jPanel7Layout.createSequentialGroup()
        .add(motorGlobaljSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(0, 0, Short.MAX_VALUE))
    );

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(19, 19, 19)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
              .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 15, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
              .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
        .add(22, 22, 22)
        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(16, 16, 16)
            .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(12, 12, 12))
          .add(layout.createSequentialGroup()
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    jPanel4.getAccessibleContext().setAccessibleName("Sensors");

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void forwardAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardAjButtonActionPerformed
        roloClientConnector.write("FORWARD-A:"+motorAjSlider.getValue());
    }//GEN-LAST:event_forwardAjButtonActionPerformed

    private void backwardAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardAjButtonActionPerformed
        roloClientConnector.write("BACKWARD-A:"+motorAjSlider.getValue());
    }//GEN-LAST:event_backwardAjButtonActionPerformed

    private void connectjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectjButtonActionPerformed
        
        if(!connected){
            connected = roloClientConnector.connect(serverAddressjTextField.getText(), 5445);
            if(connected){
                statusjLabel.setText("Connected");
                statusjLabel.setForeground(Color.green);
                connectjButton.setText("Disconnect");
            }
        }else{
            try {
                roloClientConnector.disconnect();
            } catch (Exception ex) {
                Logger.getLogger(HardwareTestUIJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            connectjButton.setText("Connect");
            statusjLabel.setText("Disconnected");
            statusjLabel.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_connectjButtonActionPerformed

    private void stopAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopAjButtonActionPerformed
        // TODO add your handling code here:
        roloClientConnector.write("STOP-A:");
    }//GEN-LAST:event_stopAjButtonActionPerformed

  private void localjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localjCheckBoxActionPerformed
    // TODO add your handling code here:
    if(localjCheckBox.isSelected()){
      serverAddressjTextField.setText("127.0.0.1");
    }else{
      serverAddressjTextField.setText("192.168.0.x");
    }
  }//GEN-LAST:event_localjCheckBoxActionPerformed

  private void backwardCjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardCjButton1ActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("BACKWARD-C:"+motorAjSlider.getValue());
    
  }//GEN-LAST:event_backwardCjButton1ActionPerformed

  private void forwardCjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardCjButton1ActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("FORWARD-C:"+motorCjSlider.getValue());
  }//GEN-LAST:event_forwardCjButton1ActionPerformed

  private void stopCjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopCjButton1ActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("STOP-C:");
  }//GEN-LAST:event_stopCjButton1ActionPerformed

  private void backwardBjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardBjButton2ActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("BACKWARD-B:"+motorAjSlider.getValue());
  }//GEN-LAST:event_backwardBjButton2ActionPerformed

  private void forwardBjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardBjButton2ActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("FORWARD-B:"+motorBjSlider.getValue());
  }//GEN-LAST:event_forwardBjButton2ActionPerformed

  private void stopBjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBjButton2ActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("STOP-B:");
  }//GEN-LAST:event_stopBjButton2ActionPerformed

  private void backwardGlobaljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardGlobaljButtonActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("BACKWARD-GLOBAL:"+motorAjSlider.getValue());
  }//GEN-LAST:event_backwardGlobaljButtonActionPerformed

  private void forwardGlobaljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardGlobaljButtonActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("FORWARD-GLOBAL:"+motorGlobaljSlider.getValue());
  }//GEN-LAST:event_forwardGlobaljButtonActionPerformed

  private void stopGlobaljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopGlobaljButtonActionPerformed
    // TODO add your handling code here:
    roloClientConnector.write("STOP-GLOBAL:");
  }//GEN-LAST:event_stopGlobaljButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HardwareTestUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HardwareTestUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HardwareTestUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HardwareTestUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HardwareTestUIJFrame().setVisible(true);
            }
        });
    }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton backwardAjButton;
  private javax.swing.JButton backwardBjButton2;
  private javax.swing.JButton backwardCjButton1;
  private javax.swing.JButton backwardGlobaljButton;
  private javax.swing.JButton connectjButton;
  private javax.swing.JTextField distancejTextField;
  private javax.swing.JButton forwardAjButton;
  private javax.swing.JButton forwardBjButton2;
  private javax.swing.JButton forwardCjButton1;
  private javax.swing.JButton forwardGlobaljButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField lightjTextField;
  private javax.swing.JCheckBox localjCheckBox;
  private javax.swing.JSlider motorAjSlider;
  private javax.swing.JSlider motorBjSlider;
  private javax.swing.JSlider motorCjSlider;
  private javax.swing.JSlider motorGlobaljSlider;
  private javax.swing.JTextArea notificationjTextArea;
  private javax.swing.JTextField serverAddressjTextField;
  private javax.swing.JLabel statusjLabel;
  private javax.swing.JButton stopAjButton;
  private javax.swing.JButton stopBjButton2;
  private javax.swing.JButton stopCjButton1;
  private javax.swing.JButton stopGlobaljButton;
  private javax.swing.JTextField touchjTextField;
  // End of variables declaration//GEN-END:variables
    
}