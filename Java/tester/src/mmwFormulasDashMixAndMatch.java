import java.util.Objects;
import java.util.Scanner;

public class mmwFormulasDashMixAndMatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opt;
        int numOne;
        int extra = 0; // just extra bucket for value storage
        int n; // the nth of all hahaahhaahah
        int cd; // common diff
        int cr; // common ratio
        int output;

        do {
            System.out.print("\nSelect a formula to use enter the initials only;\n>arithmetic sequence (as)\n>geometric sequence(gs)\nYour choice: ");
            opt = sc.next().toLowerCase();

            switch (opt) {
                case "as" -> { //arithmetic
                    System.out.println("Display the terms in a arithmetic sequence.");
                    System.out.print("Enter first number: ");
                    numOne = sc.nextInt();
                    System.out.print("Enter common difference: ");
                    cd = sc.nextInt();
                    System.out.print("Enter the number of terms to display: ");
                    n = sc.nextInt();

                    output = numOne;
                    for (int i = 1; i <= n; i++) {

                        System.out.print(output);
                        if (i < n) {
                            System.out.print(", ");
                        }
                        extra += output;

                        output += cd;

                        // sum of the sequence
                        if (i == n) {
                            System.out.println("\nSum of the sequence is: " + extra);
                        }
                    }

                }
                case "gs" -> { // geometric
                    System.out.println("Display the terms in geometric sequence.");
                    System.out.print("Enter first number: ");
                    numOne = sc.nextInt();
                    System.out.print("Enter interval: ");
                    cr = sc.nextInt();
                    System.out.print("Enter the number of terms to display: ");
                    n = sc.nextInt();

                    output = numOne;
                    for (int i = 1; i <= n; i++) {
                        ;
                        System.out.print(output);
                        if (i < n) {
                            System.out.print(", ");
                        }

                        extra += output;

                        output *= cr;

                        // sum of the sequence
                        if (i == n) {
                            System.out.println("\nSum of the sequence is: " + extra);
                        }
                    }
                }
                // next case here -------
            }

            // re-run the program if else terminate it
            System.out.print("\nRerun again? y/n: ");
            opt = sc.next();
        } while(opt.equals("y"));

        sc.close();

    }
}
