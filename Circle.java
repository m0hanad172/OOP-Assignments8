/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8lab;

/**
 *
 * @author USER
 */
public class Circle {
    
    private double radius =1.0d;
    private String color ="Red";
    public static final double pi=3.14d;
    public Circle(double radius ){
        this(radius ,"Red");
        
    }
    
    public Circle (double radius , String color ){
        this.radius=radius;
        this.color= color ;
        
    }
    
    public double  getRadius(){
        return this.radius;
        
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    @Override
    public String toString(){
        return "radius :"+this.radius+" "+"color :"+this.color;
    }
    
    public double getArea(){
        return pi*this.radius*this.radius;
    }
}
