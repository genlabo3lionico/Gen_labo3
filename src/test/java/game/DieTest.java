package game;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    Die die = new Die();

    @Test
    public void itShouldbe0(){

        assertEquals(die.getFaceValue(), 0);
    }

    @RepeatedTest(100)
    public void ItshouldbeBtw2And12(){

        die.roll();
        int res = die.getFaceValue();
        assertTrue(res >= 2 && res <= 12);
    }
}
