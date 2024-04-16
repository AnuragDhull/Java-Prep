class Circle {
    public int radius;

    public double area() {
        return 3.14 * this.radius * this.radius;
    }

}

class Cylinder extends Circle {
    public int height;

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class inheritence_prac_1 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.height = 10;
        cyl.radius = 10;
        System.out.println("Area of cylinder :-- " + cyl.area());

    }
}
