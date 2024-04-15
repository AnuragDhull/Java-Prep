class EkClass {
    int a;

    EkClass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }

}

class DoClass extends EkClass {

    DoClass(int c) {
        super(c);
        System.out.println("i am a constructor");
    }
}

public class thus_super_1 {
    public static void main(String[] args) {
        EkClass ek = new EkClass(50);
        System.out.println(ek.getA());

        DoClass d = new DoClass(5);

    }
}
