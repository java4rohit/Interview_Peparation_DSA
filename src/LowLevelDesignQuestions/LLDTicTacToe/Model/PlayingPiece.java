package LowLevelDesignQuestions.LLDTicTacToe.Model;

public class PlayingPiece {

    PieceType pieceType;

    public PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    @Override
    public String toString() {
        return "PlayingPiece{" +
                "pieceType=" + pieceType +
                '}';
    }
}
