public class class35 {

    static void change(int[] arr) {
        arr[0] = 0;
    }

    public static void main(String[] args) {
        int[] marks = { 1, 3, 4, 5, 6 };
        change(marks);
        System.out.println(marks[0]);
    }
}
