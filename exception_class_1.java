import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return super.toString() + "i am toString";
    }

    public String getMessage() {
        return super.getMessage() + "i am getMessage";
    }
}

public class exception_class_1 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter a number a :-- ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a > 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
