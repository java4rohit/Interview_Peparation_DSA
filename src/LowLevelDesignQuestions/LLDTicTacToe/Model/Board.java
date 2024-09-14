package LowLevelDesignQuestions.LLDTicTacToe.Model;

public class Board {

   public int size;
   public PlayingPiece[][] boards;


    public Board(int size) {
        this.size = size;
        boards = new PlayingPiece[size][size];
    }

}
