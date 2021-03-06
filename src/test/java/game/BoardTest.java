package game;

import game.square.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    Board b;

    @BeforeEach
    public void initBoard(){

        b = new Board();
    }

    @Test
    public void itShouldbeGO(){

        assertTrue(b.getStartingSquare().getName().equals("Go"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    public void itShouldBeDifferentName(int index){

        assertFalse(b.getNewSquare(b.getStartingSquare(), index).toString().equals(b.getStartingSquare().toString()));
    }

    @Test
    public void itShouldBeIncomeTaxSquare(){
        assertTrue(b.getSquare(4) instanceof IncomeTaxSquare);
    }
}
