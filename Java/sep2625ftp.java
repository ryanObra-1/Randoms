import java.util.Scanner;

public class sep2625ftp {
				
				public static void main(String[] args) {
								System.out.println("Hello, World!");
								
												Scanner sc = new Scanner(System.in);
								
												String troowItem;
												int troowQuantity, sandwhich, softdrinks, specialBurgar, totalItem;
												float totalPrice, change;
												final float swp = 5.50f, sdp = 9.00f, sb = 15.50f;
								
												System.out.print("\nWelcome to gregor's burgars\n");
								System.out.print("~ Menus / Price ~\n> Sandwhich - 5.50\n> Softdrink - 9.00\n> Special burgar - 15.50");
								
								System.out.print("Enter your order: ");
								troowItem = sc.next().toLowerCase();
								System.out.print("Enter quantity: ");
								troowQuantity = sc.nextInt();
								
								switch (troowItem) {
												case "sandwhich": 
																
												break;
												case "softdrink":
												
												break;
												case ""
								}
								
								
								//operators
								/*
								int a = 5, b = 2;
								int c = ++a>>b;
								System.out.print("this: " + c);
								int d = b*a++;
								System.out.print("this: " + d);
								*/
				}
}