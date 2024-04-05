import java.util.Scanner;

public class class15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website :-- ");
        String web = sc.next();
        if (web.endsWith(".org")) {
            System.out.println("organisation");
        } else if (web.endsWith(".in")) {
            System.out.println("indian");
        } else {
            System.out.println("website");
        }
        sc.close();
    }

}
