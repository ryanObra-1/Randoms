import java.util.Scanner;
public class leapYearAComprehensiveShits {
				public static void main(String[] args) {
								
								Scanner sc = new Scanner(System.in);
								
								int year = 0;
								char opt = 'y';
								
								do {
												System.out.print("Enter a year: ");
												year = sc.nextInt();
								
												if (year % 4 == 0) { // check if divisible by 4 else not leap
																if(year % 100 == 0) { // check if divisible by 100 else 
																				if (year % 400 == 0) {
																								System.out.print("leap");
																				} else {
																								System.out.print("not leap");
																				}
																} else {
																				System.out.print("leap");
																}
												} else {
																System.out.print("not leap");
												}
												
												System.out.print("\n\nopt con? y/n: ");
												String tpo = sc.next().toLowerCase();
												opt = tpo.charAt(0);
								} while(opt == 'y');
								
								sc.close();
				}
}