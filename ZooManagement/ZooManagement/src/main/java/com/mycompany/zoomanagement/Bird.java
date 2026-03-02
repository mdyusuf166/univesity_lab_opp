package com.mycompany.zoomanagement;

public class Bird extends Animal {
    boolean canFly;
    double speed;

    public Bird(String name, String species, 
            boolean hasTail, double height, boolean canFly, 
            double speed) {
        super(name, species, hasTail, height);
        this.canFly = canFly;
        this.speed = speed;
    }
    
    public void fly() {
        if (canFly) System.out.println(name + " is flying!");
        else System.out.println(name + " can't fly!");
    }
}
