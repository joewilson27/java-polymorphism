package com.wilson;
/**
 * Polymorphism -> banyak bentuk
 */
class MyApp {
    public static void main(String[] args) {

        // create object Hero
        Hero hero1 = new Hero("Joseph");
        // create object HeroStrength
        HeroStrength hero2 = new HeroStrength("Alexander");
        hero1.display();
        hero2.display();

        // polymorphic, lihat type data Hero tapi new HeroStrength
        Hero hero3 = new HeroAgility("Michelle");
        hero3.display();
        //hero3.showoff(); // tidak bisa di panggil, karena method ada di dalam child class object HeroAgility

        HeroIntel hero4 = new HeroIntel("Angel");
        hero4.display();

        HeroAgility hero5 = new HeroAgility("Bjork");
        hero5.display();
        hero5.showoff();

        // tidak bisa, karena type object harus parent dari data object yg di buat
        //HeroIntel hero4 = new Hero("Angel");

        // Array list
        Hero[] heroCollections = new Hero[4];
        heroCollections[0] = hero1; // object Hero (parent)
        heroCollections[1] = hero2; // object HeroStrength (child)
        heroCollections[2] = hero3; // object HeroAgility (child)
        heroCollections[3] = hero5; 

        heroCollections[0].display();
        heroCollections[1].display();
        heroCollections[2].display();

        System.out.println("===========LOOPING=============");
        // polymorphic
        for (Hero x: heroCollections) {
            x.display();
        }

    }
}