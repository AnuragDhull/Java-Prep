import java.util.Scanner;

public class class14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("Invalid");
        }
        sc.close();

    }
}
