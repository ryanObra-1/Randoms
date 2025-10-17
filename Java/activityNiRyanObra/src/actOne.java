import java.util.Scanner;

public class actOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userOpt, charac;
        char character;

        System.out.println("Check if a character is special or alphanumeric.");

        do {

            System.out.print("Enter character: ");
            charac = sc.next().toLowerCase();

            character = charac.charAt(0);

            if (character >= 'a' && character <= 'z') {
                System.out.print("The character is alphabet");
            } else if (character >= '0' && character <= '9') {
                System.out.print("The character is a digit");
            } else {
                System.out.print("The character is a special character");
            }

            System.out.print("\nRe-run program? y/n: ");
            userOpt = sc.next().toLowerCase();
        } while (userOpt.equals("y"));

        sc.close();

    }
}