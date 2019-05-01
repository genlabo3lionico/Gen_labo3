package player;

import game.Board;
import game.Die;
import game.Piece;
import game.Square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    Board b = new Board();
    Piece p = new Piece("Dog", new Square("Go", 0));
    Die d = new Die();

    Player p1 = new Player(b,p,d);
    Player p2 = new Player(b,p,d);

    @Test
    public void itShouldbePlayer2(){

        assertTrue(p2.getName().equals("Player2"));
    }
}
