import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        System.out.println("Enter ur name :-- ");
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        System.out.println("Hey!" + a + " good morning");
        sc.close();
    }
}
