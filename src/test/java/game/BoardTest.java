package game;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    Board b = new Board();

    @Test
    public void itShouldbeGO(){

        assertTrue(b.getStartingSquare().toString().equals("Go"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    public void itShouldBeDifferentName(int index){

        Board b = new Board();
        assertFalse(b.getSquare(b.getStartingSquare(), index).toString().equals(b.getStartingSquare().toString()));
    }
}
