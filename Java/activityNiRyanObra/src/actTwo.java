import java.util.Scanner;

public class actTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int elecConsump;
        double eP = 0.00;
        double total;
        String reRun;

        System.out.println("Electricity bill chart\n-Up to 100kWh -> P5.00 per kWh\n-101-300 kWh -> P6.00 per Kwh\n-301-500 kWh -> P7.00 per kWh\n-Above 500 kWh -> P8.00 per kWh");

        do {

            System.out.print("Enter consumption (kWh): ");
            elecConsump = sc.nextInt();

            if (elecConsump < 101) {
                eP = 5.00;
            } else if (elecConsump > 100 && elecConsump < 301) {
                eP = 6.00;
            } else if (elecConsump > 300 && elecConsump < 501) {
                eP = 7.00;
            } else if (elecConsump > 500) {
                eP = 8.00;
            }

            total = eP * elecConsump;
            System.out.println("Total bill: P" + total);

            System.out.print("Compute other bill? y/n: ");
            reRun = sc.next();
        } while (reRun.equalsIgnoreCase("y"));

        sc.close();

    }
}