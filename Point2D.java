/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8lab2;

/**
 *
 * @author USER
 */
public class Point2D {
    private int x=0;
    private int y=0 ;
    
    public Point2D(){
        
    }
    
    public Point2D(int x, int y ){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString (){
        return " Point 2D " +"x: "+this.x+" "+"y: "+this.y;
    }
}
