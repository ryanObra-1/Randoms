import java.util.Scanner;
import java.util.Random;

public class guessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Random number between 1 and 100

        System.out.println("Guess the secret number between 1 and 100!");

        Scanner scanner = new Scanner(System.in);
        boolean itsCorrect = false;

        while (!itsCorrect) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You got it!");
                itsCorrect = true;
            }
        }

        scanner.close();
    }
}