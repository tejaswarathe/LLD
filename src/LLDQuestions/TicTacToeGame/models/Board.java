package LLDQuestions.TicTacToeGame.models;

import java.util.ArrayList;
import java.util.List;

public class Board {


    int size;

    public PlayingPiece[][] getBoard() {
        return board;
    }

    PlayingPiece[][] board;


    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] == null) {
            board[row][col] = playingPiece;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            System.out.print("|");
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(" " + board[i][j].pieceType + " ");
                } else {
                    System.out.print("   ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public List<int[]> getFreeSpaces() {
        List<int[]> freeSpaces = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeSpaces.add(new int[]{i, j});
                }
            }
        }
        return freeSpaces;
    }
}
