import java.util.Scanner;

public class quizTwo {
				
				public static void main(String[] args) {
								Scanner sc = new Scanner(System.in);
								
								int softdrinks = 0;
								int sandwhiches =0;
								int totalItem = 0;
								float sdPrice = 5.50f;
								float swPrice = 9.00f;
								float cash =0;
								
								System.out.print("enter quantity of sandwhiches: "); 
								sandwhiches = sc.nextInt();
								System.out.print("enter quantity of softdrinks: "); 
								softdrinks = sc.nextInt();
								
								totalItem = softdrinks + sandwhiches;
								System.out.print("total item ordered: " + totalItem);
								
								// \n >> newline
								System.out.print("\namount to pay: " + ((float) (sdPrice * softdrinks) + (swPrice * sandwhiches)));
								
								do {
												System.out.print("\npayment: ");
												cash = sc.nextInt();
												if(cash < ((float) (sdPrice * softdrinks) + (swPrice * sandwhiches)))  
																System.out.print("your payment is kulang");
												else
																System.out.print("your paymend is VATable");
												
								} while(cash < ((float) (sdPrice * softdrinks) + (swPrice * sandwhiches)));
								
								System.out.print("your change: " + ((float) cash + ((float) (sdPrice * softdrinks) + (swPrice * sandwhiches))));
								
				}
				
}