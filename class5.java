import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km :-- ");
        int a = sc.nextInt();
        double miles = a * 0.6;
        System.out.println("miles" + miles);
        sc.close();
    }
}
