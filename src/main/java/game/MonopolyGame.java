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

    public void addPlayer(Player p){

        if(players.size() > 8){

            throw new IllegalArgumentException("Too much players");
        }
        players.add(p);
    }

    public void playGame() {

        while (roundCnt != 20){
            playRound();
            roundCnt++;
        }

    }

    private void playRound() {

        for (Player p: players) {
            p.takeTurn();
        }
    }
}
