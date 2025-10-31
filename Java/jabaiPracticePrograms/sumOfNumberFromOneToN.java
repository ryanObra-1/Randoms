import java.util.Scanner;

public class sumOfNumberFromOneToN {
				
				public static void main(String[] args) {
								
								Scanner sc = new Scanner(System.in);
								
								int nthNum, sum = 1, oddSum = 1, evenSum = 0;
								
								System.out.print("Enter the nth term: ");
								nthNum = sc.nextInt();
								
								for(int i = 0; i < nthNum; i++) {
												sum = sum + i;
												if(i % 2 == 0) {
																evenSum = evenSum + i;
												} else if(i % 2 != 0) {
																oddSum = oddSum + i;
												}
												
								}
								
								System.out.println("The the sum of 1-" + nthNum + " is " + sum + "\nThe sum of all even numbers from 1-" + nthNum + " is " + sum + "\nThe sum of all odd numbers from 1-" + nthNum + " is " + sum);
				}
}