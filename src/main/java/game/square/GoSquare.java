package game.square;

public class GoSquare extends Square {

    public GoSquare(String name, int index){

        this.name = name;

        if(index > 39){
            throw new IllegalArgumentException("out of board");
        }
        this.index = index;
    }
}
