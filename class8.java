public class class8 {
    public static void main(String[] args) {

        char grade = 'A';
        // Encrypt
        grade = (char) (grade + 8);
        System.out.println(grade);
        // Decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
