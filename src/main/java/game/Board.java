package game;

public class Board {

    static final int NBSQUARES = 40; //note should be > 0

    private Square[] squares;

    public Board(){
        squares = new Square[NBSQUARES];
        squares[0] = new Square("Go", 0);
        for(int i = 1; i < NBSQUARES; ++i)
            squares[i] = new Square(Integer.toString(i), i);
    }

    public Square getStartingSquare(){
        return squares[0];
    }

    public Square getSquare(Square oldLoc, int fvTot){
        return squares[(oldLoc.getIndex() + fvTot) % NBSQUARES];
    }
}
