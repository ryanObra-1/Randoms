import java.util.Scanner;

public class actOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // vars
        String userOpt, charac;
        char character;

        System.out.println("Check if a character is a digit, alphabet, or special character.");

        do {
            // takes user input
            System.out.print("Enter character: ");
            charac = sc.next().toLowerCase();

            character = charac.charAt(0); // converts string to char

            if (character >= 'a' && character <= 'z') { // checks if alphabet
                System.out.print("It is an alphabet.");
            } else if (character >= '0' && character <= '9') { // checks if digit
                System.out.print("It is a digit.");
            } else { // default to special char
                System.out.print("It is a special character.");
            }
            // rerun??
            System.out.print("\nRe-run program? y/n: ");
            userOpt = sc.next().toLowerCase();
        } while (userOpt.equals("y"));

        sc.close();

    }
}