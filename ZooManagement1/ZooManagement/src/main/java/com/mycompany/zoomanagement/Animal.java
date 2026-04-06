package com.mycompany.zoomanagement;

public class Animal {
    public String name, species;
    public boolean hasTail;
    public double height;

    public Animal(String name, String species, boolean hasTail, double height) {
        this.name = name;
        this.species = species;
        this.hasTail = hasTail;
        this.height = height;
    }

    public void eat() {
        System.out.println(name + " is eating food.");
    }
}
