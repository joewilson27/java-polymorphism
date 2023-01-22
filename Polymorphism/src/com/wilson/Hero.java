package com.wilson;

public class Hero {
    String name;

    Hero(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("\nName \t: " + this.name);
    }
}
