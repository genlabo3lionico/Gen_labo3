package game;

public class Player {

    static int count = 0;

    String name = "Player" + ++count;

    Board board;
    Die dice;
    Piece piece;

    public Player(Board board,Piece piece, Die dice){
        this.board = board;
        this.dice = dice;
        this.piece = piece;
    }

    void takeTurn(){
        dice.roll();
        piece.setLocation(board.getSquare(piece.getLocation(), dice.getFaceValue()));
    }

}
