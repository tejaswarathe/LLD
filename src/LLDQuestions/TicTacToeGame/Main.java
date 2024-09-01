package LLDQuestions.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame("Tejas", "Krishnendu");
        System.out.println("Game winner is: " + game.startGame());
    }
}
