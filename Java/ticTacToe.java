import java.util.Scanner;

public class ticTacToe {
    private char[][] board;
    private char currentPlayer;
    private boolean gameWon;

    public ticTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameWon = false;
        initializeBoard();
    }

    // Initialize the board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current state of the board
    private void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -+-+-");
        }
        System.out.println();
    }

    // Make a move on the board
    private boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    // Check if the current player has won
    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Check if the board is full (draw)
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Switch the current player
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Main game loop
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Enter row (0-2) and column (0-2) to make a move.");

        while (!gameWon && !isBoardFull()) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row: ");
            int row = scanner.nextInt();
            System.out.print("Enter column: ");
            int col = scanner.nextInt();

            if (makeMove(row, col)) {
                if (checkWin()) {
                    gameWon = true;
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        if (!gameWon && isBoardFull()) {
            printBoard();
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ticTacToe game = new ticTacToe();
        game.playGame();
    }
}