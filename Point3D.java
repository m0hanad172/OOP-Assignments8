/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8lab2;

/**
 *
 * @author USER
 */
public class Point3D extends Point2D{
    
    private int z =0;
    
    public Point3D(){
        
    }
    
    public Point3D(int x, int y , int z ){
        super(x,y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    @Override
    public String toString (){
        return " Point 3D  "+" x :"+super.getX()+" "+"y:"+super.getY()+" "+"z: "+this.z;
    }
}
