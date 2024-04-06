public class class23 {
    public static void main(String[] args) {

        int[] marks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // for reverse oreder
        for (int j = marks.length - 1; j >= 0; j--) {
            System.out.println(marks[j]);
        }
    }
}
