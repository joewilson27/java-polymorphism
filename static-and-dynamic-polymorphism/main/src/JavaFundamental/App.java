package JavaFundamental;

import java.util.ArrayList;
import java.util.List;

// Static Polymorphism
class Aritmatika {
    /**
     * Polymorphism static, method yang sama overloading pada class yang sama
     * @param a
     */
    void Penjumlahan(int a) {
        System.out.println("a : " + a);
    }

    void Penjumlahan(int a, int b) {
        System.out.println("a and b : " + a + ", " + b);
    }

    double Penjumlahan(double a) {
        return a + a;
    }
}
//

// Dynamic Polymorphism
class Hewan {
    public void suara() {
        System.out.println("Animal can make a sounds");
    }
}

class Dog extends Hewan {
    public void suara() {
        System.out.println("Guk guk guk");
    }
}

public class App extends Hewan {
    /**
     * Static Polymorphism adalah ketika method dalam class yang sama diulangi (overriding)
     * sedangkan Dynamic Polymorphism adalah pada saat kita melakukan method overriding pada class yang berbeda (contoh kasus di sample ini)
     */
    @Override
    public void suara() {
        System.out.println("Meringkik...");
    }
    public static void main(String[] args) throws Exception {
        // Static polymorphism
        double result;
        Aritmatika obj1 = new Aritmatika();
        obj1.Penjumlahan(5);
        obj1.Penjumlahan(5, 7);
        result = obj1.Penjumlahan(4.5d);
        System.out.println("Nilai hasil : " + result);

        // Dynamic polymorphism
        App Kuda = new App();
        Kuda.suara();

        // dynamic polymorphism
        Hewan collectionHewan[] = new Hewan[2];
        Dog anjing = new Dog();
        App binatangJadiJadian = new App();
        collectionHewan[0] = anjing;
        collectionHewan[1] = binatangJadiJadian;

        int i=0;
        for (Hewan a : collectionHewan) {
            System.out.println("dari looping " + i++);
            a.suara();
        }


        List<Hewan> listObject = new ArrayList<>();
        listObject.add(anjing);
        listObject.add(binatangJadiJadian);
        int j=0;
        for(Hewan b : listObject) {
            System.out.println("dengan list array " + j++);
            b.suara();
        }

    }
}