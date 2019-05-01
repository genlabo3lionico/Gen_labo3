package game.square;

public class RegularSquare extends Square {

    public RegularSquare(String name, int index){

        this.name = name;

        if(index > 39){
            throw new IllegalArgumentException("out of board");
        }
        this.index = index;
    }
}
