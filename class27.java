import java.util.Scanner;

public class class27 {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter element to find :-- ");
        int element = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == element) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Yes " + element + " is present");
        } else {
            System.out.println("No " + element + " is not  present");
        }
        sc.close();
    }
}
