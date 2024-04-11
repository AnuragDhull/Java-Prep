import java.util.Scanner;

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int parameter() {
        return 4 * side;
    }

}

public class oops_prac_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square :--- ");
        int side = sc.nextInt();

        Square math = new Square();
        math.side = 10;
        System.out.println("Side of a square :-- " + side);
        System.out.println("Area of a square :-- " + math.area());
        System.out.println("Parameter of a square :-- " + math.parameter());

        sc.close();
    }
}
