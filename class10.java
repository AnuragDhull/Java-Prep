import java.util.Scanner;

public class class10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age :-- ");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("you are adult");
                break;
            case 23:
                System.out.println("Ready to go to job");
                break;
            case 60:
                System.out.println("Time to retire");
                break;
            default:
                System.out.println("Enjoy ur life");
        }
        sc.close();
    }
}
