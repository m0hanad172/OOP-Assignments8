/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8lab;

/**
 *
 * @author USER
 */
public class Cylinder extends Circle {
    
    private double hight =1.0d;
    
    
    
    public Cylinder(double hight){
       this(hight,1.000,"no color ");
    }
    
    public Cylinder (double hight , double radius ){
        this(hight ,radius ,"Red ");
    }
    public Cylinder (double hight, double radius , String color  ){
        super(radius , color);
        this.hight=hight ;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
 @Override
    public String toString (){
        return " hight: "+this.hight+" "+"radius: "+super.getRadius()+" "+"color: "+super.getColor();
    }   
    
 
   
    public double getVolume(){
        return pi*super.getRadius()*super.getRadius()*this.hight;
    }
}
