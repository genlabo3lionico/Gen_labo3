package game;

import game.square.*;

public class Board {

    static final int NBSQUARES = 40; //note should be > 0

    private Square[] squares;

    public Board(){
        squares = new Square[NBSQUARES];
        squares[0] = new GoSquare("Go", 0);
        for(int i = 1; i < NBSQUARES; ++i) {

            if(i == 4){
                squares[i] = new IncomeTaxSquare("IncomeTax", i);
            }
            else if(i == 30){
                squares[i] = new GoToJailSquare("GoToJail", i);
            }
            else{
                squares[i] = new RegularSquare(Integer.toString(i), i);
            }
        }
    }

    public Square getStartingSquare(){
        return squares[0];
    }

    public Square getNewSquare(Square oldLoc, int fvTot){
        return squares[(oldLoc.getIndex() + fvTot) % NBSQUARES];
    }

    public Square getSquare(int index){
        return squares[index];
    }
}
