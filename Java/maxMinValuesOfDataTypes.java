import java.util.Scanner;

public class maxMinValuesOfDataTypes {
				
				public static void main(String[] args) {
								
								Scanner sc = new Scanner(System.in);
								
								byte bytE = Byte.MAX_VALUE;
								short shorT = Short.MAX_VALUE;
								long lonG = Long.MAX_VALUE;
								char chR = Character.MAX_VALUE;
								int inT = Integer.MAX_VALUE;
								float floaT = Float.MAX_VALUE;
								double doublE = Double.MAX_VALUE;
								String bool = "true / 1";
								//boolean = true;
								
								System.out.print("max value of:\n\n byte = " + bytE + "\n short = " + shorT + "\n long = " + lonG + "\n char = " + chR + "\n int = " + inT + "\n float = " + floaT + "\n double = " + doublE + "\n boolean = " + bool + "\n\n");
								
								bytE = Byte.MIN_VALUE;
								shorT = Short.MIN_VALUE;
								lonG = Long.MIN_VALUE;
								chR = Character.MIN_VALUE;
								inT = Integer.MIN_VALUE;
								floaT = Float.MIN_VALUE;
								doublE = Double.MIN_VALUE;
								bool = "false / 0";
												
								System.out.print("min value of:\n\n byte = " + bytE + "\n short = " + shorT + "\n long = " + lonG + "\n char = " + chR + "\n int = " + inT + "\n float = " + floaT + "\n double = " + doublE + "\n boolean = " + bool);
				}
}































