public class recursion_prac_3 {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum of natural number :-- " + result);
    }
}
