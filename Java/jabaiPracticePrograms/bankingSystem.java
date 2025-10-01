import java.util.Scanner;

public class bankingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char transactionType;
        float balance = 0;
        float depositAmount;
        float withdrawalAmount;
        float transactionFee = 0.01f;
        char opt; // option var for y/n

        do {
            System.out.print("Welcome, please select the type of transaction");
            do {
                System.out.print("\n(deposit/withdrawal/check balance): ");
                transactionType = sc.next().charAt(0);
            }
            while (transactionType != 'd' && transactionType != 'w' && !(transactionType == 'c' || transactionType == 'b'));
            /* while condition's truth table
                tT -----
                d   -   w   -   c||b
                while -----
                ~d / ~w  -> if user inputs are VALID negate it then become FALSE
                !(c||b)  -> if EITHER of the user's input is VALID the output becomes TRUE then negate it returning FALSE
                output -----
                false && false -> return FALSE hence breaking the loop
            */

            if (transactionType == 'd') { // deposit
                System.out.print("Enter amount to deposit: ");
                depositAmount = sc.nextFloat();
                depositAmount -= (depositAmount * transactionFee); // dedects the fee
                balance += depositAmount;
                System.out.println("Total balance is " + balance + " with " + (depositAmount * transactionFee) + " from 1% transaction fee deducted.");
            } else if (transactionType == 'w') { // withdrawal
                System.out.print("Enter amount to withdraw: ");
                withdrawalAmount = sc.nextFloat();
                balance -= (transactionFee * balance); // deducts the fee
                balance -= withdrawalAmount;
                System.out.println("Total balance is " + balance + " with " + (transactionFee * balance) + " from 1% transaction fee deducted.");
            } else { // check balance
                System.out.println("Your account balance is: " + balance);
            }

            System.out.print("Open new transaction? y/n: ");
            opt = sc.next().charAt(0);

        } while(opt == 'y');

        System.out.println("Transaction ended");

        sc.close();
    }
}
