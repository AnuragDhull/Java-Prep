public class class26 {
    public static void main(String[] args) {

        float[] marks = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
        float sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println("sum of marks :-- " + sum);
    }
}
