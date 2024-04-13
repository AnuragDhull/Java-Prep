
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

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    public double surfaceArea() {
        return (2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);
    }

}

public class cons_mod_prac_2 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(10, 10);
        System.out.println("Radius of cylinder :-- " + cyl.getRadius());
        System.out.println("Height of cylinder :-- " + cyl.getHeight());
    }
}
