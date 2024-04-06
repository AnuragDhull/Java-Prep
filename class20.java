import java.util.Scanner;

public class class20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-- ");
        int number = sc.nextInt();
        int table;

        for (int i = 10; i >= 1; i--) {
            table = number * i;
            System.out.println(number + " X " + i + " = " + table);
        }
        sc.close();
    }
}
