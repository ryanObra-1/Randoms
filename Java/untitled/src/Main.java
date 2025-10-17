import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        System.out.print("Enter a Character: ");
        input = scanner.next().charAt(0);
        if(Character.isLetter(input)) System.out.println("It's a Letter. ");
        else if (Character.isDigit(input)) System.out.println("It's a Digit. ");
        else System.out.println("It's a Special letter. ");

        scanner.close();
    }

}