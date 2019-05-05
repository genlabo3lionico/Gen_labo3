package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonopolyGameTest {

    @Test
    public void itShouldHaveAnIllegalArgumentExeception() {

        assertThrows(IllegalArgumentException.class, () -> new MonopolyGame(9));
    }
}
