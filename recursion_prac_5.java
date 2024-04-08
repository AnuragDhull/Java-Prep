public class recursion_prac_5 {

    static void pat(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pat(5);
    }
}