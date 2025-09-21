import java.util.Scanner;
        
public class areaOfShapeCalculator { // class start
	
	public static void main(String[] args) { // main start
		
		Scanner input=new Scanner(System.in);
		
		// variables
		int l=0, w=0, h=0, r=0, s=0, b=0;
        final double PI = 3.14;
        int choice;
        char opt;

		do {
			System.out.println("Area of shape calculator");
			System.out.print("\n1) Rectangle = l × w\n2) Square = l × w\n3) Circle = π × r²\n4) Triangle = (1/2 × b)h\n5) Parallelogram = b × h\n\n");
			
			do {
			    System.out.print("select shape:");
			    choice = input.nextInt();
			} while(choice > 5 || choice < 1);
			
			if(choice == 1) { // for rectangle
			    System.out.println("You chose rectangle");
			    System.out.print("input length: ");
			    l = input.nextInt();
			    System.out.print("input width: ");
			    w = input.nextInt();
			    System.out.print("the area of rectangle is " + l*w);
			} else if(choice == 2) { // for square
			    System.out.println("You chose Square");
			    System.out.print("input length: ");
			    l = input.nextInt();
			    System.out.print("input width: ");
			    w = input.nextInt();
			    System.out.print("the area of square is " + l*w);
			} else if(choice == 3) { // for circle
			    System.out.println("You chose Circle");                System.out.print("input radius: ");
			    r = input.nextInt();
			    double pow =  Math.pow(r, 2);
			    double area = (double) PI*pow;
			    System.out.print("the area of square is " + area);
			} else if(choice == 4) { // for triangle
			    System.out.println("You chose Triangle");
			    System.out.print("input base: ");
			    b = input.nextInt();
			    System.out.print("input height: ");
			    h = input.nextInt();
			    double based = (double) 0.5*b;
			    double area = (double) based*h;
			    System.out.print("the area of triangle is " + area);
			} else if(choice == 5) { // for parallelogram
			    System.out.println("You chose Parallelogram");
			    System.out.print("input length: ");
			    b = input.nextInt();
			    System.out.print("input width: ");
			    h = input.nextInt();
			    System.out.print("the area of parallelogram is " + b*h);
			}
			
			// prompt the user to restart or exit
			do {
		        System.out.print("\n\ncalculate new shape?");
    		    opt = input.next().charAt(0);
    		    Character.toLowerCase(opt);
    		    //illogical logic 
    		    if(opt != 'n' && opt != 'y') {
    		        System.out.println("enter a valid input.");
    		    }
			} while(opt != 'n' && opt != 'y');
    		
		} while((l < 0 || w < 0 || h < 0 || r < 0 || s < 0 || b < 0) || opt == 'y');			
		
		// cjoses the scanner
		if(opt == 'n') {
		    input.close();
		}
	} // main method end
	
} // class end