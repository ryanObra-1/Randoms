import java.util.Scanner;

public class actFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //vars
        String userOpt;
        char grade;
        String remark;

        System.out.println("GWA computer");

        do {
            // user input
            System.out.print("Enter first-fifth grades (0-100): ");
            int firstSub = sc.nextInt();
            int secondSub = sc.nextInt();
            int thirdSub = sc.nextInt();
            int fourthSub = sc.nextInt();
            int fifthSub = sc.nextInt();

            //compute for avearage (n1+n2+...)/totalItem
            int average = (firstSub + secondSub + thirdSub + fourthSub + fifthSub) / 5;
            System.out.print("Average: " + average);

            //check grade values and initialize a values to grade and remark
            if (average >= 90 && average <= 100 ) {
                grade = 'A';
                remark = "Excellent";
            } else if (average >= 80 && average <= 89 ) {
                grade = 'B';
                remark = "Very Good";
            } else if (average >= 70 && average <= 79 ) {
                grade = 'C';
                remark = "Good";
            } else if (average >= 60 && average <= 69 ) {
                grade = 'D';
                remark = "Fair";
            } else {
                grade = 'F';
                remark = "Failed";
            }

            // output grade and remakr
            System.out.print("\nGrade: " + grade);
            System.out.print("\nRemarks: " + remark);

            //rerun
            System.out.print("\n\nCompute other grades? y/n: ");
            userOpt = sc.next().toLowerCase();
        } while (userOpt.equals("y"));

        sc.close();

    }
}