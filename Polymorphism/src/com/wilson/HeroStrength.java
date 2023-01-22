package com.wilson;

public class HeroStrength extends Hero {
    String type = "Strength";

    // karena class Hero ada constructor, maka class child harus pakai constructor juga
    HeroStrength(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type \t:" + this.type);
    }
}
