public class class28 {
    public static void main(String[] args) {

        int[] marks = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        float average = (float) sum / marks.length;
        System.out.print("average of marks is :-- " + average);

    }
}
