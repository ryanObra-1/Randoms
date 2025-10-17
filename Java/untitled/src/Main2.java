import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;

        System.out.print("Enter number of consumption : ");
        double kwh = sc.nextDouble();

        if (kwh > 0 && kwh <= 100){
            result = kwh * 5.00;
            System.out.println("your total bill is: " + result);
        } else if (kwh >= 101 && kwh <= 300) {
            result = kwh * 6.00;
            System.out.println("your total bill is: " + result);
        } else if (kwh >= 301 && kwh <= 500) {
            result = kwh * 7.00;
            System.out.println("your total bill is: " + result);
        } else if (kwh >= 501) {
            result = kwh * 8.00;
            System.out.println("your total bill is: " + result);
        } else {
            System.out.println("invalid");
        }
    }
}














