class Mythread extends Thread {
    public Mythread(String name) {
        System.out.println("Hey good morning bruhhhh....");
    }
}

public class thread_constructor_1 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("anurag");
        t1.start();

        // System.out.println("The id of thread is :-- " + t1.getId());
        System.out.println("the name of thread is ;-- " + t1.getName());

    }
}
