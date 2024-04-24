
// Creating thread by extending thread class //

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am cokking !!!!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am chatting !!!!");
            i++;
        }
    }
}

public class thread_1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2(); 
        t1.start();
        t2.start();
    }
}
