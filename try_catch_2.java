import java.util.Scanner;

public class try_catch_2 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of array :-- ");
        int ind = sc.nextInt();

        System.out.print("Number by which you want to divide it :--");
        int num = sc.nextInt();

        try {
            System.out.println("number at given index is :-- " + marks[ind]);
            int d = marks[ind] / num;
            System.out.print("Result is :-- " + d);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zeroe");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("choose number from range");
        } catch (Exception e) {
            System.out.println("some error there");
        }

        sc.close();
    }

}
