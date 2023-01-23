package JavaFundamental;

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
    }
}