package player;

import game.Board;
import game.Die;
import game.Piece;
import game.square.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @BeforeAll
    static void displayTestDescription(){
        System.out.println("We'll test Player's behaviour");
    }

    @Test
    void simplePlayerMockTest(){

        //We'll check player state during a board lap

        //We initialize a player.

        Board board = new Board();
        Square startingSquare = board.getStartingSquare();
        Piece piece = new Piece("hat", startingSquare);
        //Create a mock version of die that always return 1
        Die die = Mockito.mock(Die.class);  //mock version of die
        Mockito.when(die.getFaceValue()).thenReturn(1); //inject a different behaviour
        int money = 2001;
        Player player = new Player(board, piece, die, money);

        //player's piece should start at location 0 on the board
        assert(piece.getLocation().getIndex() == 0);

        //player move 1 forward (because of mocked dice
        player.takeTurn();
        //player should now be at location 1
        assert(piece.getLocation().getIndex() == 1);

        //We ask player to move until he arrives at location 4 which is
        //an income square
        for(int i = 2; i <= 4; ++i) player.takeTurn();
        //we check that player's piece is indead on an IncomeTaxSquare
        assert(piece.getLocation().getClass() == IncomeTaxSquare.class);
        //we check that player's total money is now 200 less than before
        assert(player.getMoney() == 1801);

        for(int i = 5; i <= 29; ++i) player.takeTurn();
        //we check that player is on square of location 29
        assert(piece.getLocation().getIndex() == 29);
        //we check money amount is still 1801
        assertEquals(player.getMoney(), 1801);

        //we move from square 29 to square 30, which is jail square:
        //this means the player will now at location 10
        player.takeTurn();
        assert(piece.getLocation().getIndex() == 10);
        //money is still 1801
        assert(player.getMoney() == 1801);

        //we are now going to square 40 in one step
        //we trick the dice again so that it returns systematically 30
        Mockito.when(die.getFaceValue()).thenReturn(30);
        //The player takes turn to end up in the go square again
        player.takeTurn();
        //player should be on go square
        assertSame(piece.getLocation(),board.getStartingSquare());
        //player should have earned 200
        assert(player.getMoney() == 2001);

    }



}
