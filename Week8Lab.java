/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week8lab;

/**
 *
 * @author USER
 */
public class Week8Lab {

    public static void main(String[] args) {
       
        Circle c1= new Circle (2.1," blue ");
        System.out.println(c1.toString());
        System.out.println(c1.getRadius());
        
        System.out.println("Area: "+c1.getArea());
        
        Cylinder cl1= new Cylinder (3.5,2.1,"green");
        System.out.println(cl1.toString());
        System.out.println("volume "+cl1.getVolume());
    }
}
