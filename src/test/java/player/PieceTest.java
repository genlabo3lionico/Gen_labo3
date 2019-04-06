package player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PieceTest {

    @Test
    public void theNameShouldBeEqual() {

        Piece piece = new Piece("Dog");
        assertEquals(piece.getName(), "Dog");
    }

}

