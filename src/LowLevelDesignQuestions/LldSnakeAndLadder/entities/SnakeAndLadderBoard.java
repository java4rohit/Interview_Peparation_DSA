package LowLevelDesignQuestions.LldSnakeAndLadder.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnakeAndLadderBoard {

    private int size;

    private List<Snake> snakes;
    private List<Ladder> ladders;

    private Map<String,Integer> playerPieces;

    public SnakeAndLadderBoard() {
    }
    public SnakeAndLadderBoard(int size) {
        this.size = size;
        this.snakes = new ArrayList<Snake>();
        this.ladders = new ArrayList<Ladder>();
        this.playerPieces = new HashMap<String, Integer>();
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public Map<String, Integer> getPlayerPieces() {
        return playerPieces;
    }

    public void setPlayerPieces(Map<String, Integer> playerPieces) {
        this.playerPieces = playerPieces;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public String toString() {
        return "SnakeAndLadderBoard{" +
                "ladders=" + ladders +
                ", size=" + size +
                ", snakes=" + snakes +
                ", playerPieces=" + playerPieces +
                '}';
    }
}
