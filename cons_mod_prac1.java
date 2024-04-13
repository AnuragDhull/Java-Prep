class Cylinder {
    int radius;
    int height;

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea() {
        return (2 * 3.14 * (radius * radius + (2 * 3.14 * radius * height)));
    }

}

public class cons_mod_prac1 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();

        cyl.setRadius(10);
        cyl.setHeight(10);

        System.out.println("Radius of cylinder :-- " + cyl.getRadius());
        System.out.println("Height of cylinder :-- " + cyl.getHeight());

        System.out.println("Area of cylinder :-- " + cyl.surfaceArea());
    }
}
