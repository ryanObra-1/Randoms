/*
 *
 * enter hourly rate
 * enter workhour
 * overtime rate if workhour > 40
 * 1.5 * rate * overtime
 * deduction rate if workhour < 40
 * totalSalary - (rate * missing_hours)
 * 
 */

import java.util.Scanner;

public class par {
				public static void main(String[] args) {
								
								Scanner sc = new Scanner(System.in);
								
								float hourlyRate = 0, workHour = 0, overtimeRate = 0, deductionRate = 0, totalSalary = 0, extraVar = 0;
								
								System.out.print("Enter hourly rate: ");
								hourlyRate = sc.nextFloat();
								System.out.print("Enter work hours: ");
								workHour = sc.nextFloat();
								
								if (workHour > 40) {
												System.out.print("Enter overtime rate: ");
												overtimeRate = sc.nextFloat();
												
												extraVar = workHour - 40;
												extraVar = 1.5f * hourlyRate * extraVar;
												totalSalary = (hourlyRate * workHour) + extraVar;
												
								} else if (workHour < 40){
												System.out.print("Enter deduction rate: ");
												deductionRate = sc.nextFloat();
								
												extraVar = 40 - workHour;
												extraVar = extraVar * hourlyRate;
												totalSalary = hourlyRate * workHour;
												totalSalary = totalSalary - extraVar;
								
								} else {
												System.out.print("No overtime and deduction.\n");
												totalSalary = hourlyRate * workHour;
								}
								
								
								
								
								
								System.out.println("-----------------------------");
								System.out.print("Hourly rate: " + hourlyRate + "\nWork hours: " + workHour + "\nOvertime rate: " + overtimeRate + "\nDeduction: " + deductionRate + "\nTotal salary: " + totalSalary);
								
								sc.close();
				}
				
}