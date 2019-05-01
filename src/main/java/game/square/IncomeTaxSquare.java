package game.square;

public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare(String name, int index){

        this.name = name;

        if(index > 39){
            throw new IllegalArgumentException("out of board");
        }
        this.index = index;
    }
}
