public class class31 {
    public static void main(String[] args) {

        int[] marks = { 40, 50, 1, 20, 55 };
        boolean isSort = true;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > marks[i + 1]) {
                isSort = false;
                break;
            }
        }
        if (isSort) {
            System.out.println("Sorted");
        } else {
            System.out.println("no");
        }
    }
}
