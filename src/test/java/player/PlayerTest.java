package player;

import game.Board;
import game.Die;
import game.Piece;
import game.square.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    Board b = new Board();
    Piece p = new Piece("Dog", new GoSquare("Go", 0));
    Die d = new Die();

    Player p1 = new Player(b,p,d, 1500);
    Player p2 = new Player(b,p,d, 1500);

    @Test
    public void itShouldbePlayer2(){

        assertEquals(p2.getName(), ("Player2"));
    }

    //Enables Mock annotations
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void simplePlayerMockTest(){
        Board board = new Board();
        Square startingSquare = board.getStartingSquare();
        Piece piece = new Piece("hat", startingSquare);

        //Create a mock version of die that always return 1
        Die die = Mockito.mock(Die.class);  //mock version of die
        Mockito.when(die.getFaceValue()).thenReturn(1); //inject a different behaviour

        int money = 10000;

        Player player = new Player(board, piece, die, money);

        assert(piece.getLocation().getIndex() == 0);

        player.takeTurn();

        assert(piece.getLocation().getIndex() == 1);

    }



}
