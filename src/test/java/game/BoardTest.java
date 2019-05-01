package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void itShouldbeGO(){

        Board b = new Board();
        assertTrue(b.getStartingSquare().toString().equals("Go"));
    }
}
