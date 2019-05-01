package player;

import game.Board;
import game.Die;
import game.Piece;
import game.square.*;

public class Player {

    static int count = 0;

    private String name = "Player" + ++count;

    private Board board;
    private Die dice;
    private Piece piece;

    private int money;

    public Player(Board board,Piece piece, Die dice, int money){
        this.board = board;
        this.dice = dice;
        this.piece = piece;
        this.money = money;
    }

    public void takeTurn(){
        dice.roll();
        piece.setLocation(board.getNewSquare(piece.getLocation(), dice.getFaceValue()));

        if(piece.getLocation() instanceof GoSquare){
            money += 200;
        }
        else if(piece.getLocation() instanceof GoToJailSquare){
            piece.setLocation(board.getSquare(10));
        }
        else if(piece.getLocation() instanceof IncomeTaxSquare){

            if(money/10 > 200){
                money -= money/10;
            }
            else{
                money -= 200;
            }
        }
    }

    public String getName(){
        return name;
    }
}
