package javaPracticeCodes;

import java.util.Scanner;

public class zellersCongruence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // formula >> h = (q+((26(m+1))/10+)+k+(k/4)+(j/4)+(5*j))%7

        // terminal based with primitive variable
        // where k = year, j = century, m = month, q = day of the month
        float q, m, k, j;
        float h;
        float termOne, termTwo, termThree, termFour;
        char opt = 'n';

        do {
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            k = year % 100;
            j = (float) year / 100;

            System.out.print("Enter month (1-12): ");
            m = sc.nextInt();
            if (m == 1) {
                m += 12f;
            } else if (m == 2) {
                m += 12f;
            }

            //System.out.println(m);

            System.out.print("Enter day (1-31): ");
            q = sc.nextInt();

            // solution for jan and fed but somehow cant fix some leap years
            if(m == 13 || m == 14) {
                q -= 2;
            }

            termOne = m + 1; // this line
            termOne *= 26; // represents the
            termOne /= 10f; // ((26(m+1))/10) equation
            termTwo = k / 4f;
            termThree = j / 4f;
            termFour = 5 * j;

            h = (int) q + termOne + k + termTwo + termThree + termFour;

            //System.out.println("h = " + h + "to = " + termOne + "tt = " + termTwo + "tth = " + termThree + "tf = " + termFour + "q = " + q + "j = " + j + "k = " + k + "m = " + m);

            //h -= 1;
            h = (int) h % 7;

            switch ((int) h) {
                case 0:
                    System.out.println("the day of the week is saturday");
                    break;
                case 1:
                    System.out.println("the day of the week is sunday");
                    break;
                case 2:
                    System.out.println("the day of the week is monday");
                    break;
                case 3:
                    System.out.println("the day of the week is tuesday");
                    break;
                case 4:
                    System.out.println("the day of the week is wednesday");
                    break;
                case 5:
                    System.out.println("the day of the week is thursday");
                    break;
                case 6:
                    System.out.println("the day of the week is friday");
                    break;
            }

            System.out.print("Enter new date? y/n: ");
            opt = sc.next().charAt(0);

        } while(opt == 'y');

        sc.close();
// ------------------------------------------------------------------------------------
    }

}