/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.rolo.world.api;

/**
 *
 * @author salaboy
 */
public interface WorldObject {
    int getPositionX();
    int getPositionY();
    int getPositionZ();
    int getOrientation();
    
    void setPositionX(int x);
    void setPositionY(int y);
    void setPositionZ(int z);
    void setOrientation(int orientation);
}
