import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1 :--");
        int a = sc.nextInt();
        System.out.println("Enter marks of subject 2 :--");
        int b = sc.nextInt();
        System.out.println("Enter marks of subject 3 :--");
        int c = sc.nextInt();
        System.out.println("Enter marks of subject 4 :--");
        int d = sc.nextInt();
        System.out.println("Enter marks of subject 5 :--");
        int e = sc.nextInt();

        int sum = a + b + c + d + e;
        double per = ((double) sum / 500) * 100;
        System.out.println("Your final result :--" + per + "%");
        sc.close();
    }
}
