import java.util.Scanner;

public class asciiShape {
	public static void main(String[] args) {
		
		int size = 10 - 1; //number starts at 0
		
		System.out.println("inverted side triangle\n");
		//decreasing
		for (int i = size; i >= 0; i--) {
		    for (int j = 0; j <=i; j++) {
		        System.out.print(" *");
		    }   
		    System.out.print(" \n");
		}
		
		System.out.println("\n\nside triangle\n");
/*		
		//increasing
		for (int i = size; i >= 0; i++) {
		    for (int j = 0; j <= i; j++) {
		        System.out.print("i ");
		    }
		    System.out.print("k \n");
        }
		*/
	}
}