import java.util.Scanner;
public class asciiShape {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //decreasing
        // for loop
        int size = 5; //number starts at 0
        System.out.println("inverted left side triangle\n");
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.print(" \n");
        }
        
        // do while
        int i = 0;
        int j = 0;
        do {
            while(j <= i) {
                System.out.print(" *");
                j++;
            }
            System.out.print("\n");
            i--;
        } while(i <= 5);
        
        System.out.println("\n\nleft side triangle\n");
        //increasing
        //for (int i  )
        
        System.out.println("\n\nright side triangle\n");
        
        
												}
}