import java.util.Scanner;

public class class7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-- ");
        boolean b = sc.hasNextInt();
        System.out.println(b);

        if (b == true) {
            System.out.println(b + " is a integer");
        } else {
            System.out.println(b + " is not a integer");
        }
        sc.close();

    }
}
