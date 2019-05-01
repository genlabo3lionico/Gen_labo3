package player;

import game.Board;
import game.Die;
import game.Piece;

public class Player {

    static int count = 0;

    private String name = "Player" + ++count;

    private Board board;
    private Die dice;
    private Piece piece;

    public Player(Board board,Piece piece, Die dice){
        this.board = board;
        this.dice = dice;
        this.piece = piece;
    }

    public void takeTurn(){
        dice.roll();
        piece.setLocation(board.getSquare(piece.getLocation(), dice.getFaceValue()));
    }

    public String getName(){
        return name;
    }
}
