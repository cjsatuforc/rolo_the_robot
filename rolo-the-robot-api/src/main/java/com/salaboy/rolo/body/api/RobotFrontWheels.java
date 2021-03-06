/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.rolo.body.api;

/**
 *
 * @author salaboy
 */
public interface RobotFrontWheels extends RobotPart{
    void move(String direction, int distance);
    
    void rotate(String direction, int degrees);
    
    void setWheelSpeed(String wheel, int speed);
    
    void rotateAndMove(String direction, int degrees, String moveDirection);
    
    void setWheelsDistance(int distance);
    void setWheelsDiameter(int diameter);
    
    RobotMotor getRightMotor();
    RobotMotor getLeftMotor();
    
    void stopAll();
    
    void forward();
    
    void backward();
   
}
