package game;

import player.Player;

import java.util.ArrayList;

public class MonopolyGame {

    private int roundCnt;
    private ArrayList<Player> players;

    public MonopolyGame() {

        roundCnt = 0;
        players = new ArrayList<>();

    }

    public void playGame() {


    }

    private void playRound() {

        while (roundCnt != 20){

            for (Player p: players) {
                p.takeTurn();
            }
            roundCnt++;
        }
    }
}
