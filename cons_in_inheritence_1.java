class Base1 {
    Base1() {
        System.out.println("I am a base constructor ");
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("I am a derived constructor");
    }

    Derived1(int x, int y) {
        System.out.println(x + y);
    }
}

public class cons_in_inheritence_1 {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();

        Derived1 d = new Derived1(5, 10);
    }
}
