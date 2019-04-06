package game;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {


    @Test
    public void itShouldbe0(){

        Die die = new Die();
        assertEquals(die.getFaceValue(), 0);

    }

    @RepeatedTest(100)
    public void ItshouldbeBtw1And6(){

        Die die = new Die();
        die.roll();
        int res = die.getFaceValue();
        assertTrue(res >= 1 && res <= 6);
    }

}
