import java.util.Scanner;;

public class class11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1 :-- ");
        int a = sc.nextInt();
        System.out.println("Enter marks of subject 2 :-- ");
        int b = sc.nextInt();
        System.out.println("Enter marks of subject 3 :-- ");
        int c = sc.nextInt();
        int total = a + b + c;
        double totaPer = ((float) (total) / 300) * 100;
        System.out.println("your total perc :-- " + totaPer + "%");

        if (a >= 33 && b >= 33 && c >= 33 && totaPer >= 40) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are fail");
        }

        sc.close();
    }
}
