import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int mod = 0;
		char opt = 'n';
		
		
		do{
		do {
		    System.out.print("enter a number to check if odd or even: ");
		    num = sc.nextInt();
		    if(num < 0) {
		        System.out.print("the number is invalid, please enter a real number.\n");
		    } 
		} while(num < 0);
		
		/*
		mod = num%2;	
		if(mod == 0)
		*/
		
		// both conditoon will work
		
		if((mod = num%2) == 0) {
		    System.out.println("the number is even");
		} else {
		    System.out.println("the number " + num +" is odd");
		}    
		
		System.out.print("re-enter number? y/n: ");
		opt = sc.next().charAt(0);
		} while(opt == 'y');
	}
}


// 