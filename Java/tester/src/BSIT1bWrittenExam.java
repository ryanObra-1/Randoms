import java.util.ArrayList;
import java.util.Scanner;

public class BSIT1bWrittenExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1, j = 0, k = 0;
        String nth, pluralOdd = "numbers is", pluralEven = "numbers is";
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter ten(10) numbers then check if the number is odd pr even.");

        do {

            nth = switch (i) { //set value to nth according to number's rank
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };

            System.out.print("Enter " + i + nth + " number: ");
            nums.add(sc.nextInt()); // add value to the array

            i++;

        } while(i != 11);

        i = -1; // reset the ietrator reference
        
        System.out.println("\n" + nums + "\n");

        do {

            i++;

            if (nums.get(i) % 2 == 0) {
                j++;
            } else {
                k++;
            }

        } while (i != 9);

        if (j > 1) {// grammatical check
            pluralEven = "numbers are";
        }
        if (k > 1) {
            pluralOdd = "numbers are";
        }

        System.out.println(j + " " + pluralEven + " even.\n" + k + " " + pluralOdd +" odd.");

        sc.close();
    }
}
