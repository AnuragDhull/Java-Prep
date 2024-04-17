abstract class Parent2 {
    public Parent2() {
        System.out.println("me parent 2 class ka constructor hoo !!");
    }

    abstract public void greet1();

    abstract public void greet2();

}

class Beta extends Parent2 {
    @Override
    public void greet1() {
        System.out.println("namaste ram ram !! ");
    }

    @Override
    public void greet2() {
        System.out.println("acha hum chalte hai !! ");
    }
}

public class abstarct_1 {
    public static void main(String[] args) {
        // Parent2 par= new Parent2() ; error cant inititae object of abstract class

        Beta bet = new Beta();
        bet.greet1();
        bet.greet2();

    }
}
