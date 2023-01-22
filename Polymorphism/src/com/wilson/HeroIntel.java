package com.wilson;

public class HeroIntel extends Hero {
    String type = "Intel";

    // karena class Hero ada constructor, maka class child harus pakai constructor juga
    HeroIntel(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type \t:" + this.type);
    }
}
