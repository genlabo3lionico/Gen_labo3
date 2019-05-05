package game;

import game.square.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    Board b = new Board();

    @Test
    public void itShouldHaveAnIllegalArgumentExeception(){

        assertThrows(IllegalArgumentException.class, () -> new RegularSquare("Prison", 40));
    }

    @Test
    public void itSchoudBeNotEqualsSquareClass(){

        assertNotEquals(b.getSquare(0).getClass(), b.getSquare(1).getClass());
    }

    @Test
    public void ItDontShouldBeTheSameRegularSquare(){

        assertNotSame(b.getSquare(1), b.getSquare(2));
    }
}
