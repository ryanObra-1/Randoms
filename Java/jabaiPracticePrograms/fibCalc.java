package javaPracticeCodes;

import java.util.Scanner;

public class fibCalc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		char choice = 'y';
		
		System.out.println("calculate the nth term in the fibinacci sequence\n");
		do {
		do {
    		System.out.print("enter the nth term: ");
    		n = sc.nextInt();
    		//n -= 1;
    		if(n < 0) {
    		    System.out.println("\nplease enter a valid intput containing natural number\n");
    		}
		} while(n < 0);
		
		float sqrtOfFive = (float) Math.sqrt(5);
		
		/*
		formula:
		(((1+√5)/2)^n - ((1-√5)/2)^n)/√5
		*/
		
		// first parentheses
		float firstParFristLayer = (float) 1+sqrtOfFive;
		float firstParSecondLayer = (float) firstParFristLayer/2;
		float firstParPowerOf = (float) Math.pow(firstParSecondLayer, n);
		
		//System.out.println(firstParPowerOf);
		
		// second parentheses 
		float secondParFristLayer = (float) 1-sqrtOfFive;
		float secondParSecondLayer = (float) secondParFristLayer/2;
		float secondParPowerOf = (float) Math.pow(secondParSecondLayer, n);
		
		// subtract the 2 parentheses
		float difference = (float) firstParPowerOf - secondParPowerOf;
		
		// calculate the quotient 
		float nthTerm = (float) difference/sqrtOfFive;
		
		//output
		System.out.println("\nthe " + n + "th term in the fibonacci sequence is " + nthTerm);
		
		//re enter
		System.out.println("\n\nenter new nth term? y/n");
		choice = sc.next().charAt(0);
		} while(choice == 'y');
	}
}