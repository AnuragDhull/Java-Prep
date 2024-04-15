class A {
    public int a;

    public int haryy() {
        return 4;
    }

    public void meth2() {
        System.out.println("i am method of class A");
    }
}

class B extends A {
    public void meth2() {
        System.out.println("i am method of class B");
    }

    public void meth3() {
        System.out.println("i am a  2nd method of class B");
    }
}

public class Method_overriding_1 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
        b.meth3();
    }
}
