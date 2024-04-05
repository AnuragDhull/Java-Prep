import java.util.Scanner;

public class class12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur annual income :-- ");
        double income = sc.nextDouble();

        if (income < 2.5) {
            System.out.println("No tax for you ");
            System.out.println("Your tax is :-- " + 0);
        } else if (income < 5.0) {
            System.out.println("5% tax for you");
            System.out.println("Your tax is :-- " + (0.05 * income));
        } else if (income < 10.0) {
            System.out.println("5% tax for you");
            System.out.println("Your tax is :-- " + (0.2 * income));
        } else if (income > 10.0) {
            System.out.println("5% tax for you");
            System.out.println("Your tax is :-- " + (0.3 * income));
        }
        sc.close();
    }
}
