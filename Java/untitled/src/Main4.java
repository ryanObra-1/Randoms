import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your grade in first subject: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter your grade in second subject: ");
        double grade2 = sc.nextDouble();
        System.out.println("Enter your grade in third subject: ");
        double grade3 = sc.nextDouble();
        System.out.println("Enter your grade in fourth subject: ");
        double grade4 = sc.nextDouble();
        System.out.println("Enter your grade in fifth subject: ");
        double grade5 = sc.nextDouble();

        double ave = (grade1+grade2+grade3+grade4+grade5)/5;
        System.out.println("Average: "+ ave);
        if (ave<60) {
            System.out.println("Grade: F");
            System.out.println("Remarks: Failed");}
        else if (ave>=60 && ave<=69) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Fair");}
        else if (ave>=70 && ave<=79) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");}
        else if (ave>=80 && ave<=89) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");}
        else if (ave>=90 && ave<=100) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");}


    }
}
