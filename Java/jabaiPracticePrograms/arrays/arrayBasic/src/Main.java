import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //vars
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int extra = 0, sum = 0, average;
        char rerun;

        do {
            // loops to ask user to input data
            for (int i = 0; i < num.length; i++) {
                extra++;
                // user input data to array
                System.out.print("Enter a number " + extra + " of 5: ");
                num[i] = sc.nextInt();
                // check if loop is at last term if yes proceeds to next process
                if (i == (num.length-1)) {
                    //takes even num in array using modulo
                    System.out.print("Even numbers: ");
                    //loops over the data set
                    for (int j = 0; j < num.length; j++) {
                        if ((num[j] % 2) == 0) {
                            if (num[j] == 0) {
                                System.out.print("");
                            } else {
                                System.out.print(num[j] + " ");
                            }
                        }
                        // takes the average using (sumOfNum)/num.length
                        sum += num[j];
                        average = sum/num.length;
                        if (j == num.length-1) {
                            System.out.println("\nAverage: " + average);
                            // loop initializes the var to the last term in array
                            for (int k = num.length-1; k > -1; k--) {
                                if (k == 4) {
                                    System.out.print("Reversed order: ");
                                }
                                System.out.print(num[k] + " ");
                            }
                        }
                    }
                }
            }
            //yeeeeesssssssssssssssssss
            System.out.print("\nRerun program [yes/no]: ");
            rerun = sc.next().toLowerCase().charAt(0);
            if (rerun == 'y') {
                System.out.println("----------------------");
            }
            // reset counter
            extra = 0;
        } while(rerun != 'n');
        sc.close();
    } // main close
} // class close