package LowLevelDesignQuestions.LldSnakeAndLadder.main;

import LowLevelDesignQuestions.LldSnakeAndLadder.entities.Ladder;
import LowLevelDesignQuestions.LldSnakeAndLadder.entities.Player;
import LowLevelDesignQuestions.LldSnakeAndLadder.entities.Snake;
import LowLevelDesignQuestions.LldSnakeAndLadder.service.SnakeAndLadderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakeAndLadderDriver {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter No Of Snakes :");
        int noOfSnakes = scanner.nextInt();

        System.out.println("Enter Snakes position :");
        List<Snake> snakes = new ArrayList<Snake>();
        for (int i = 0; i < noOfSnakes; i++) {
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }


        System.out.println("Enter No Of Ladders :");
        int noOfLadders = scanner.nextInt();

        System.out.println("Enter Ladders position :");
        List<Ladder> ladders = new ArrayList<Ladder>();
        for (int i = 0; i < noOfLadders; i++) {
            ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println("Enter No Of Players :");
        int noOfPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<Player>();

        for (int i = 0; i < noOfPlayers; i++) {
            players.add(new Player(scanner.next()));
        }

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setLadders(ladders);

        snakeAndLadderService.startGame();
    }
}
