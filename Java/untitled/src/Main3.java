import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int year;

        System.out.print("input a year: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("it is a leap year");}
             else if ( year % 100 != 0 ) {
                System.out.println("it is not a leap year");}
                else {
                    System.out.print( "invalid"); }

            }
        }


