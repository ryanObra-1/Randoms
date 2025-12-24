import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for fibonnaci : ");
        int fibo = sc.nextInt();

        if (fibo > 0) {
            System.out.print("First " + fibo + " Fibonacci numbers: ");
            long a = 0, b = 1;
            for (int i = 0; i < fibo; i++) {

                System.out.print(a + (i < fibo-1 ? " " : ""));
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        } else {
            System.out.println("Please enter a positive integer greater than 0.");
        }
        sc.close();
    }
}