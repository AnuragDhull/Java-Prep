class Base {
    int x;

    public void setName(int a) {
        x = a;
    }

    public int getName() {
        return x;
    }

}

class Derived extends Base {
    int y;

    public void setName(int b) {
        y = b;
    }

    public int getName() {
        return y;
    }

}

public class inheritence_1 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setName(10);
        System.out.println(d.getName());

    }
}
