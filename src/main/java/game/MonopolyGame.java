package game;

import player.Player;

import java.util.ArrayList;

public class MonopolyGame {

    static int NB_ROUND = 20;

    private int roundCnt;
    private ArrayList<Player> players;

    public MonopolyGame() {

        roundCnt = 0;
        players = new ArrayList<>();

        //To test if it's correct
        Board b1 = new Board();
        Piece p1 = new Piece("Dog", new Square("Go", 0));
        Die d1 = new Die();

        Player player1 = new Player(b1, p1, d1);
        addPlayer(player1);

        Piece p2 = new Piece("Car", new Square("Go", 0));
        Player player2 = new Player(b1, p2,d1);

        addPlayer(player2);
    }

    public void addPlayer(Player p){

        if(players.size() > 8){

            throw new IllegalArgumentException("Too much players");
        }
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
