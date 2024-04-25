class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello goodmorning !!!");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Welcome !!!!");
    }
}

public class threads_prac_1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
