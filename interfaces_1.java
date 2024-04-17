interface Bicycle {
    void applyBrake(int decrement);

    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    public void applyBrake(int decrement) {
        System.out.println("bake lagao !!!!");
    }

    public void speedUp(int increment) {
        System.out.println("speed badaho !!!!! ");
    }
}

public class interfaces_1 {
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.speedUp(5);
        cycle1.applyBrake(5);
    }
}
