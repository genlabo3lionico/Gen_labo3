package player;

import game.Board;
import game.Die;
import game.Piece;
import game.square.GoSquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    Board b = new Board();
    Piece p = new Piece("Dog", new GoSquare("Go", 0));
    Die d = new Die();

    Player p1 = new Player(b,p,d, 1500);
    Player p2 = new Player(b,p,d, 1500);

    @Test
    public void itShouldbePlayer2(){

        assertTrue(p2.getName().equals("Player2"));
    }
}
