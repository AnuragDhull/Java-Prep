import java.util.Scanner;

public class class19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-- ");
        int number = sc.nextInt();
        int table;

        for (int i = 1; i <= 10; i++) {
            table = number * i;
            System.out.println(number + " X " + i + " = " + table);
        }
        sc.close();
    }
}
