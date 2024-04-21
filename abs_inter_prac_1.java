abstract class Pen {
    public void greet() {
        System.out.println("hey i am a pen ");
    }

    abstract public void write();

    abstract public void refill();
}

class FountainPen extends Pen {
    public void write() {
        System.out.println("hey i am writing !!!!");
    }

    public void refill() {
        System.out.println("plz refill me !!!!!");
    }
}

public class abs_inter_prac_1 {
    public static void main(String[] args) {
        FountainPen pn = new FountainPen();
        pn.greet();
        pn.write();
        pn.refill();
    }
}
