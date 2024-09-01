package LLDQuestions.TicTacToeGame;

import LLDQuestions.TicTacToeGame.models.*;

import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame(String player1Name, String player2Name) {
        initializeGame(player1Name, player2Name);
    }

    private void initializeGame(String player1Name, String player2Name) {
        gameBoard = new Board(3);
        players = new LinkedList<>();
        Player player1 = new Player(player1Name, new PlayingPieceX());
        players.addLast(player1);
        Player player2 = new Player(player2Name, new PlayingPieceO());
        players.addLast(player2);
    }

    public String startGame() {

        while (true) {
            Player currentPlayer = players.pollFirst();

            gameBoard.printBoard();

            List<int[]> freeSpaces = gameBoard.getFreeSpaces();
            if (freeSpaces.isEmpty()) {
                break;
            }

            System.out.println("Player: " + currentPlayer.getName() + ", Enter row and column: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);


            boolean pieceAddedSuccessFully = gameBoard.addPiece(row, column, currentPlayer.getPlayingPiece());
            if (!pieceAddedSuccessFully) {
                System.out.println("Incorrect position, Please try again");
                players.addFirst(currentPlayer);
                continue;
            }

            players.addLast(currentPlayer);

            if (isThereAWinner(row, column, currentPlayer.getPlayingPiece().getPieceType())) {
                return currentPlayer.getName();
            }
        }

        return "Game Tied!";
    }

    public boolean isThereAWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.getBoard()[i][column] == null || gameBoard.getBoard()[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        for (int i = 0, j = 0; i < gameBoard.getSize(); i++, j++) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        for (int i = 0, j = gameBoard.getSize() - 1; i < gameBoard.getSize(); i++, j--) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
