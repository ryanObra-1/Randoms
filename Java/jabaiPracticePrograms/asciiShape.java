import java.util.Scanner;
public class asciiShape {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int size = 5; //number starts at 0
        System.out.println("inverted left side triangle\n");
        //decreasing
        for (int i = (size -1); i >= 0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.print(" \n");
        }
        
        System.out.println("\n\nleft side triangle\n");
        //increasing
        //for (int i  )
        
        System.out.println("\n\nright side triangle\n");
        
        char[][] pos = {{'O', 'T', 'h'},{},{},{},{},{},{},{},{'t', 'd', 'c'}};
        
        
        
        char initial;
        System.out.print("enter your name: ");
        initial = sc.next().charAt(0);
        System.out.println("your initial is: " + initial);
        
        
        
        //System.out.print(pos[][].length());
        int a = 5, b = 2, k, l, n;
								int c = ++a>>b;
								System.out.print("\nthis: " + c);
								int d = b*a++;
								System.out.print("\nthis: " + d);
       k = c & d;
        System.out.println("\nthis: "+k+"");
      //  5>2?System.out.print("c"):System.out.print("d");
												}
}