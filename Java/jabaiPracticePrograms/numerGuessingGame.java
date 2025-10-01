import java.util.Scanner;

public class numerGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberRange;
        int randomNumber;
        int playerGuess;
        int guessChances = 5;
        char playOpt;

        System.out.println("Number guessing game");

        do {
            System.out.print("Enter number range: ");
            numberRange = sc.nextInt();

            //System.out.println(numberRange);

            randomNumber = (int) (Math.random()*numberRange);

            //System.out.println(randomNumber);

            do {

                System.out.print("Enter your guess from 0-" + numberRange + "\nyou have " + guessChances + " guesses: ");
                playerGuess = sc.nextInt();

                if (playerGuess == randomNumber) {
                    System.out.println("Your guess is correct!");
                } else if (playerGuess > randomNumber) {
                    System.out.println("Your guess is higher.");
                    guessChances -= 1;
                } else {
                    System.out.println("Your guess is lower.");
                    guessChances -= 1;
                }

                if (guessChances < 1) {
                    System.out.println("Your guesses are incorrect!");
                }

            } while(playerGuess != randomNumber && guessChances != 0);

            guessChances = 5;

            System.out.print("Play again? y/n: ");
            playOpt = sc.next().toLowerCase().charAt(0);

        } while(playOpt != 'n');

        System.out.println("Nc game!");

        sc.close();
    }
}
