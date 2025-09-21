package javaPracticeCodes;

import java.util.Scanner;

public class set182025ftp {
				
				public static void main(String[] args) {
								Scanner sc = new Scanner(System.in);
								int x = 0;
								int y = 0;
								int opt;
								int celcius = 0;
								
								System.out.println("enter 2 numbers to show their sum, difference, product, quotient, and remainder");
								
								do {
												System.out.print("enter first number:");
												x = sc.nextInt();
												System.out.print("enter sencond number: ");
												y = sc.nextInt();
								} while((x>0 && x<0) || (y>0 && y<0));
								
								System.out.println("the sum is " + (x+y) + "\nthe difference is " + (x-y) + "\nthe product is " + (x*y) + "\nthe quotient is " + ((float) x/y) + "\nthe remainder is " + (x%y) + "\n\n");
								
								
								
								System.out.print("continue to problem 2? y/n: "); 
								opt = sc.next().charAt(0);
								
								if(opt == 'y') {
												System.out.print("enter temperature in celcius to be converted in fahrenheit: ");
												celcius = sc.nextInt();
												System.out.println("the fahrenheit conversion is " + ((float)(celcius*(9/5))+35) + "C");
												
												sc.close();
								}
				}
				
}