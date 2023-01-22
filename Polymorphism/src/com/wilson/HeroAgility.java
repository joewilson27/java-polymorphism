package com.wilson;

public class HeroAgility extends Hero {
    String type = "Agility";

    // karena class Hero ada constructor, maka class child harus pakai constructor juga
    HeroAgility(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type \t:" + this.type);
    }

    void showoff() {
        System.out.println("I'm agility hero");
    }
}
