import java.util.Scanner;

public class actThree {
				public static void main(String[] args) {
								
								Scanner sc = new Scanner(System.in);
								
								int year;
								String userOpt;
								
								System.out.println("Check if a year is a leap year");
								
								do {
												
												System.out.print("Enter a year: ");
												year = sc.nextInt();
												
												if (year % 4 == 0) {
																																System.out.print(year + " is a leap year.");
												}
												
												System.out.print("\nRe-run program? y/n: ");
												userOpt = sc.next().toLowerCase();
								} while (userOpt.equals("y"));
								
								sc.close();
								
								}
				}

