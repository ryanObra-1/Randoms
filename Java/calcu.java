import java.util.Scanner;
public class calcu {
				public static void main(String[] args) {
						//		System.out.println("Hello, World!");
								
												Scanner cai = new Scanner(System.in);
								
								char operator;
								int num1;
								int num2;
								double answer = 0;
								boolean bool;
								
								System.out.print("Enter the operator: ");
								operator = cai.next().charAt(0);
								
								System.out.print("Enter first number: ");
								num1 = cai.nextInt();
								
								System.out.print("Enter second number: ");
								num2 = cai.nextInt();
								
								if(operator == '+') {
												answer = num1 + num2;
								} else if(operator == '-') {
												answer = num1 - num2;
								} else if(operator == '*') {
												answer = num1 * num2;
								} else if(operator == '÷') {
												answer = (double) num1 / num2;
								}
								
								System.out.print("The answer is: " + answer + "\n");
								
								if ((num1 > num2 ? true : false) == true) {
												System.out.print("\nnum1 is greater ");
								} else {
												System.out.print("hahahaha it's false");
								}
								
								
								
				}
}