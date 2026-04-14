package com.example;

import java.util.InputMismatchException;

public class Cylinder {
    
    public static double calcSurface(double radius, double height) {
        if(radius <= 0) {
            throw new InputMismatchException("Hiba! A sugárnak 0-nál nagyobb számnak kell lenni!");
        }
        if(height <= 0) {
            throw new InputMismatchException("Hiba! A magasságnak 0-nál nagyobb számnak kell lenni!");
        }
        return (2*Math.PI*Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    }

}
