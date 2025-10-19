// the input is a disaster and the first player's pick is shown instead of hidden in 2 player mode------
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gameMode;
        int playerOneWins = 0;
        int playerTwoWins = 0;
        String opt = ""; // variable for player one
        String[] opponentsOption = {"rock", "paper", "scissors"}; // for single player's opponent's choice
        int randomOpt; // final single player's opponent's choice against the player
        String opponentsOpt = ""; // player two in gamemode 2
        char playAgain;
        int winStreak = 0;
        int draw = 0;
        int noOfGamePlayed = 0;

        System.out.println("\nrock paper scissor game");

        do {
            do {
                // game mode selection
                System.out.print("\nselect gfamemode single player or two player? 1/2: ");
                gameMode = sc.nextInt();
                // will only execute if the player selected a invalid choice
                if (gameMode > 2 || gameMode < 1) {
                    System.out.print("enter a vaild mode from the chpoices!!!");
                }
            } while(gameMode > 2 || gameMode < 1);

            if (gameMode == 1) { // for single player inputs
                do {
                    System.out.print("\nenter your pick (rock/paper/scissor): ");
                    opt = sc.nextLine().toLowerCase();
                } while(!opt.equals("rock") && !opt.equals("scissors") && !opt.equals("paper"));

                randomOpt = (int) (Math.random() * opponentsOption.length);
                opponentsOpt = opponentsOption[randomOpt];
                System.out.println("opponent's pick: " + opponentsOpt);
            }

            if (gameMode == 2) { // for two player

                do {
                    System.out.print("\nplayer one enter your pick (rock/paper/scissor): ");
                    opt = sc.nextLine().toLowerCase();
                } while (!opt.equals("rock") && !opt.equals("paper") && !opt.equals("scissors"));
                do {
                    System.out.print("\nplayer tweo enter your pick (rock/paper/scissor): ");
                    opponentsOpt = sc.nextLine().toLowerCase();
                } while(!opponentsOpt.equals("rock") && !opponentsOpt.equals("paper") && !opponentsOpt.equals("scissors"));
                
            }

            // nested sheets
            if ((opt.equals("rock") && opponentsOpt.equals("scissors")) || (opt.equals("scissors") && opponentsOpt.equals("paper")) || (opt.equals("paper") && opponentsOpt.equals("rock"))) {
                if (gameMode == 1) {
                    System.out.println("You won!");
                    winStreak++;
                } else {
                    System.out.println("player one won!!");
                    playerOneWins++;
                }
            } else if ((opt.equals("scissors") && opponentsOpt.equals("rock")) || (opt.equals("rock") && opponentsOpt.equals("paper")) || (opt.equals("paper") && opponentsOpt.equals("scissors"))) {
                if (gameMode == 1) {
                    System.out.println("You lost!");
                } else {
                    System.out.println("player two won!!");
                    playerTwoWins++;
                }
            } else {
                System.out.println("Draw!");
                draw++;
            }

            noOfGamePlayed++;

            if (gameMode == 1) {
                System.out.println("you've won " + winStreak + " out of " + noOfGamePlayed + " game/s.");
            }

            if (gameMode == 2){
                System.out.println("player one's wins: " + playerOneWins + "\nplayer two's wins: " + playerTwoWins + "\ndraw: " + draw +"\nin " + noOfGamePlayed + " games played");
            }

            // wanna play again? :(
            do {
                System.out.print("\nplay again? y/n: ");
                playAgain = sc.next().toLowerCase().charAt(0);
            } while(playAgain != 'n' && playAgain != 'y');

            // gg well played
            if (playAgain == 'n') {
                System.out.println("nice game!");
            }

            // hahahaha
            if(noOfGamePlayed == 100) {
                System.out.println("you really have a lot of time to waste? //0x1cd8");
            }

        } while (playAgain == 'y');

        // memory leakedn't
        sc.close();
    }
}
