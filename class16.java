import java.util.Scanner;
import java.util.Random;

public class class16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock 1 for paper 2 for scisoor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You win!!!");
        } else {
            System.out.println("computer win");
        }
    }
}
