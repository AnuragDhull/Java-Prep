import java.util.Arrays;
import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        // Variables //
        String name = "Anurag";
        String padosi = "Anmol";
        int age = 21;
        String dost = padosi;

        // Types //

        // Primitive
        byte nu = 30;
        int phone = 1234567890;
        long phone2 = 123345667899L;
        float pie = 3.14F;
        char letter = '@';
        boolean isadult = false;

        // Non-Primitive
        String name1 = "Anurag";
        System.out.println(name1.length());
        String name3 = new String("jaat");

        // Strings

        // concat
        String name4 = "anurag";
        String name5 = "dhull";
        String name6 = name4 + " and " + name5;
        System.out.println(name6);

        // charAt
        String name7 = "anurag";
        System.out.println(name7.charAt(5));

        // replace
        String name8 = "Anurag";
        System.out.println(name8.replace('a', 'g'));

        // sub-string
        String name9 = "Anurag and Dhull";
        System.out.println(name9.substring(0, 5));

        // Arrays //
        int[] marks10 = new int[3];
        marks10[0] = 97;
        marks10[1] = 86;
        marks10[2] = 98;
        System.out.println(marks10[1]);

        // Length
        System.out.println(marks10.length);
        // Sort
        Arrays.sort(marks10);
        System.out.println(marks10);

        int[] marks11 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // 2d-arrays

        int[][] finalMarks = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 } };
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks[1][0]);
        System.out.println(finalMarks[1][1]);

        // Casting
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        int p = 100;
        int fp = p + (int) 18.0;
        System.out.println(fp);

        // Constant
        final float Pie = 3.14F;
        System.out.println(Pie);

        // Operators
        int a = 1;
        int b = 2;
        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println(sum);
        System.out.println(dif);
        System.out.println(mul);
        System.out.println(div);

        int numb = 1;
        numb = numb + 1;
        numb++;
        System.out.println(numb);

        // Maths

        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));

        // Random
        System.out.println((int) Math.random());

        // Input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age :--");
        int age2 = sc.nextInt();
        float age3 = sc.nextFloat();

        String name2 = sc.nextLine();
        System.out.println(name2);

        // if-else

        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");

        int age4 = 30;
        if (age4 > 18)
            System.out.println("can vote");
        else
            System.out.println("cant vote");

        // Logical Operators
        int a1 = 10;
        int b1 = 50;
        if (a1 < 50 && b1 > 80)
            System.out.println("true");

        // Conditional
        Scanner sc1 = new Scanner(System.in);
        int cash = sc1.nextInt();
        if (cash < 10) {
            System.out.println("u cant buy anything");
            System.out.println("bring more cash");

        } else if (cash > 10 && cash < 50) {
            System.out.println("you can buy one");
        }

        // Switch
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("invaid");
        }

        // Loops
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        int j = 100;
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        Scanner sc3 = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number :-- ");
            number = sc3.nextInt();
            System.out.println(number);
        } while (number >= 0);
        System.out.println("The End");

        // Break-Continue
        int i6 = 0;
        while (true) {
            System.out.println(i6);
            i6++;
            if (i6 > 10) {
                break;
            }
        }

        // Try -catch
        int[] marks = { 10, 20, 30 };
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {

        }
        System.out.println("name is anurag");

        // Functions
        printJava();
        printJava();
        printJava();
        printName("anurag");
        printName("Dhull");
        printSum(5, 10);

    }

    public static void printJava() {
        System.out.println("hello java");

    }
    public static void printName(String name)
    {
        System.out.println(name);
    }
    public static void printSum(int a ,int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
}