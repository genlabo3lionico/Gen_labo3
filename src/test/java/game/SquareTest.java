package game;

import game.square.RegularSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void itShouldHaveAnIllegalArgumentExeception(){

        assertThrows(IllegalArgumentException.class, () -> new RegularSquare("Prison", 40));
    }
}
