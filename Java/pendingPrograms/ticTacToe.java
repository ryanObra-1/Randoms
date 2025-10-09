import java.util.Scanner;

public  class ticTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char playerone;
        char playerTwo = ' ';
        char playerOpt; // play again?
        boolean yes = true;
        int row;
        int col;
        // row 1  and columns 1-3
        char rcOO = ' ';
        char rcOT = ' ';
        char rcOTh = ' ';
        // row 2 and columns 1-3
        char rcTO = ' ';
        char rcTT = ' ';
        char rcTTh = ' ';
        // row 3 and columns 1-3
        char rcThO = ' ';
        char rcThT = ' ';
        char rcThTh = ' ';

        System.out.println("stupid ttt game");
        System.out.println("Enter letter 'o' and 'x'\nthree times in a row, column or diagonal to win.\nPlayer one will select 'o' or 'x'\n'o' will play first\n");

        do {
            do {
                System.out.print("Player one select o/x: ");
                playerone = sc.next().charAt(0);
                if (playerone == 'o') {
                    playerTwo = 'x';
                } else if (playerone == 'x') {
                    playerTwo = 'o';
                }
                // validation
                if (playerone != 'o' && playerone !='x') {
                    System.out.println("Enter enter a valid value from the option.");
                }
            } while (playerone != 'o' && playerone !='x');

            do {

                // game board itself ffffffffffffk
                System.out.println("\n   1   2   3 ");
                System.out.println("1  " + rcOO + " | " + rcOT + " | " + rcOTh);
                System.out.println("  ---+--+---");
                System.out.println("2  " + rcTO + " | " + rcTT + " | " + rcTTh);
                System.out.println("  ---+--+---");
                System.out.println("3  " + rcThO + " | " + rcThT + " | " + rcThTh);

                System.out.println("\nPlayer one(" + playerone + ") enter Row-Column number..");

                System.out.print("row: ");
                row = sc.nextInt();

                System.out.print("col: ");
                col = sc.nextInt();

                if (row == 1 && col == 1) {
                    rcOO = playerone;
                } else if (row == 1 && col == 2) {
                    rcOT = playerone;
                } else if (row == 1 && col == 3) {
                    rcOTh = playerone;
                } else if (row == 2 && col == 1) {
                    rcTO = playerone;
                } else if (row == 2 && col == 2) {
                    rcTT = playerone;
                } else if (row == 2 && col == 3) {
                    rcTTh = playerone;
                } else if (row == 3 && col == 1) {
                    rcThO = playerone;
                } else if (row == 3 && col == 2) {
                    rcThT = playerone;
                } else if (row == 3 && col == 3) {
                    rcThTh = playerone;
                }

                // will update after p1 play
                System.out.println("\n   1   2   3 ");
                System.out.println("1  " + rcOO + " | " + rcOT + " | " + rcOTh);
                System.out.println("  ---+--+---");
                System.out.println("2  " + rcTO + " | " + rcTT + " | " + rcTTh);
                System.out.println("  ---+--+---");
                System.out.println("3  " + rcThO + " | " + rcThT + " | " + rcThTh);

                System.out.println("\nPlayer two(" + playerTwo + ") enter Row-Column number..");

                System.out.print("row: ");
                row = sc.nextInt();

                System.out.print("col: ");
                col = sc.nextInt();

                if (row == 1 && col == 1) {
                    rcOO = playerTwo;
                } else if (row == 1 && col == 2) {
                    rcOT = playerTwo;
                } else if (row == 1 && col == 3) {
                    rcOTh = playerTwo;
                } else if (row == 2 && col == 1) {
                    rcTO = playerTwo;
                } else if (row == 2 && col == 2) {
                    rcTT = playerTwo;
                } else if (row == 2 && col == 3) {
                    rcTTh = playerTwo;
                } else if (row == 3 && col == 1) {
                    rcThO = playerTwo;
                } else if (row == 3 && col == 2) {
                    rcThT = playerTwo;
                } else if (row == 3 && col == 3) {
                    rcThTh = playerTwo;
                }

                System.out.println("\n   1   2   3 ");
                System.out.println("1  " + rcOO + " | " + rcOT + " | " + rcOTh);
                System.out.println("  ---+--+---");
                System.out.println("2  " + rcTO + " | " + rcTT + " | " + rcTTh);
                System.out.println("  ---+--+---");
                System.out.println("3  " + rcThO + " | " + rcThT + " | " + rcThTh);

//                // abomination // blunder pare
//                if (rcOO == playerone && rcOT == playerone && rcOTh == playerone) {
//                    pOneYes = true;
//                } else if (rcTO == playerone && rcTT == playerone && rcTTh == playerone) {
//                    pOneYes = true;
//                } else if (rcThO == playerone && rcThT == playerone && rcThTh == playerone) {
//                    pOneYes = true;
//                } else if (rcOO == playerone && rcTO == playerone && rcThO == playerone) {
//                    pOneYes = true;
//                } else if (rcOT == playerone && rcTT == playerone && rcThT == playerone) {
//                    pOneYes = true;
//                } else if (rcOTh == playerone && rcTTh == playerone && rcThTh == playerone) {
//                    pOneYes = true;
//                } else if (rcOTh == playerone && rcTT == playerone && rcThO == playerone) {
//                    pOneYes = true;
//                } else if (rcOO == playerone && rcTT == playerone && rcThTh == playerone) {
//                    pOneYes = true;
//                }
//                // same logic different structure tf
//                if (rcOO == playerTwo && rcOT == playerTwo && rcOTh == playerTwo) {
//                    pOneYes = true;
//                } else if (rcTO == playerTwo && rcTT == playerTwo && rcTTh == playerTwo) {
//                    pTwoYes = true;
//                } else if (rcThO == playerTwo && rcThT == playerTwo && rcThTh == playerTwo) {
//                    pTwoYes = true;
//                } else if (rcOO == playerTwo && rcTO == playerTwo && rcThO == playerTwo) {
//                    pTwoYes = true;
//                } else if (rcOT == playerTwo && rcTT == playerTwo && rcThT == playerTwo) {
//                    pTwoYes = true;
//                } else if (rcOTh == playerTwo && rcTTh == playerTwo && rcThTh == playerTwo) {
//                    pTwoYes = true;
//                } else if (rcOTh == playerTwo && rcTT == playerTwo && rcThO == playerTwo) {
//                    pTwoYes = true;
//                } else if (rcOO == playerTwo && rcTT == playerTwo && rcThTh == playerTwo) {
//                    pTwoYes = true;
//                }

                // best??
                char[][] pos = {{rcOO, rcOT, rcOTh}, {rcTO, rcTT, rcTTh}, {rcThO, rcThT, rcThTh}};

                // checking if better
                for (int i = 0; i <= 1; i++) {

                    if (((pos[0][i] == playerone) || (pos[1][i] == playerone) || ((pos[2][i] == playerone))  || ((pos[0][0] == playerone && pos[1][1] == playerone && pos[2][2] == playerone) || (pos[0][2] == playerone && pos[1][1] == playerone && pos[2][0] == playerone)))) {
                        System.out.println("Player one wins!");
                        yes = false;
                    } else if (((pos[0][i] == playerTwo) || (pos[1][i] == playerTwo) || ((pos[2][i] == playerTwo)) || ((pos[0][0] == playerTwo && pos[1][1] == playerTwo && pos[2][2] == playerTwo) || (pos[0][2] == playerTwo && pos[1][1] == playerTwo && pos[2][0] == playerTwo)))) {
                        System.out.println("Player two wins!");
                        yes = false;
                    }

                    for (int k = 0; k <= 1; k++) {
                        System.out.println(pos[i][k]);

                         if (pos[i][k] != ' ') {
                            System.out.println("Match draw!");
                            yes = false;
                        }

                    }
                }


            // condition error
            } while (yes /*!(rcOO == ' ' && rcOT == ' ' && rcOTh == ' ') || (rcTO != ' ' && rcTT != ' ' && rcTTh != ' ') || (rcThO != ' ' && rcThT != ' ' && rcThTh != ' ') || (rcOO != ' ' && rcTO != ' ' && rcThO != ' ') || (rcOT != ' ' && rcTT != ' ' && rcThT == ' ') || (rcOTh != ' ' && rcTTh != ' ' && rcThTh != ' ') || (rcOTh != ' ' && rcTT != ' ' && rcThO != ' ') || (rcOO != ' ' && rcTT != ' ' && rcThTh != ' ')*/);



            System.out.print("Play again? y/n: ");
            playerOpt = sc.next().charAt(0);

            if (playerOpt == 'y') { // will reset the values per row and columns
                // row 1  and columns 1-3
                rcOO = ' ';
                rcOT = ' ';
                rcOTh = ' ';
                // row 2 and columns 1-3
                rcTO = ' ';
                rcTT = ' ';
                rcTTh = ' ';
                // row 3 and columns 1-3
                rcThO = ' ';
                rcThT = ' ';
                rcThTh = ' ';
            }

        }while(playerOpt == 'y');

        System.out.println("ggs");

        sc.close();
    }
}


// brainedfucked
//(rcOO == playerOne && rcOT == playerOne && rcOTh == playerOne) || (rcTO == playerOne && rcTT == playerOne && rcTTh == playerOne) || (rcThO == playerOne && rcThT == playerOne && rcThTh) || (rcOO == playerOne && rcTO == playerOne && rcThO) || (rcOT == playerOne && rcTT == playerOne && rcThT == playerOne) || (rcOTh == playerOne && rcTTh == playerOne && rcThTh == playerOne) || (rcOTh == playerOne && rcTT == playerOne && rcThO == playerOne) || (rcOO == playerOne && rcTT == playerOne && rcThTh == playerOne)