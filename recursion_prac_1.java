public class recursion_prac_1 {

    static void mul(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " X " + i + " = " + result);

        }

    }

    public static void main(String[] args) {
        mul(5);

    }
}
