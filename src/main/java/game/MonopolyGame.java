package game;

import game.square.*;
import player.Player;

import java.util.ArrayList;

public class MonopolyGame {

    static int NB_ROUND = 20;

    private int roundCnt;
    private ArrayList<Player> players;

    public MonopolyGame(int nbrPlayer) {

        if(nbrPlayer > 8){

            throw new IllegalArgumentException("Too much player");
        }

        roundCnt = 0;
        players = new ArrayList<>();

        Board b = new Board();
        Die d = new Die();

        for (int i = 0; i < nbrPlayer ; i++) {
            Piece p = new Piece( Integer.toString(i), new GoSquare("Go", 0));
            Player player = new Player(b, p, d, 1500);
            addPlayer(player);
        }
    }

    public void addPlayer(Player p){

        players.add(p);
    }

    public void playGame() {

        for (roundCnt = 0; roundCnt < NB_ROUND ; ++roundCnt) {
            playRound();
        }
    }

    private void playRound() {

        for (Player p: players) {
            p.takeTurn();
        }
    }
}
