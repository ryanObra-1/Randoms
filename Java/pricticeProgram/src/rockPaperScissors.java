import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opt = "";
        String opponentsOpt;

        System.out.println("rock paper scissor game");
        System.out.print("enter your pick (rock/paper/scissor): ");
        opt = sc.nextLine().toLowerCase();

        opponentsOpt = Math.random();
        
        if ((opt == "rock" && opponentsOpt == "scissors") || (opt == "scissors" && opponentsOpt == "paper") || (opt == "paper" && opponentsOpt == "rock")) {
            System.out.println("You won!");
        } else if ((opt == "scissors" && opponentsOpt == "rock") || (opt == "rock" && opponentsOpt == "paper") || (opt == "paper" && opponentsOpt == "scissors")) {
            System.out.println("You lost!");
        } else {
            System.out.println("Draw!");
        }
    }
}
