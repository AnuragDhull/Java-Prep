import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        String str = "Anurag";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :--");
        int a = sc.nextInt();
        System.out.println("Enter a second nuber :--");
        int b = sc.nextInt();
        System.out.println("Sum of numbers :-- " + (a + b));

        System.out.println("Enter a line");
        String c = sc.nextLine();
        System.out.println(c);

    }
}
