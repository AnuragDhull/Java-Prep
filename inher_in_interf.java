interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class mySampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("This is method 1");
    }

    public void meth2() {
        System.out.println("This is method 2 ");
    }

    public void meth3() {
        System.out.println("This is method 3 ");
    }

    public void meth4() {
        System.out.println("This is method 4 ");
    }
}

public class inher_in_interf {
    public static void main(String[] args) {
        ///// Inheritence in Interface /////////
    }
}
