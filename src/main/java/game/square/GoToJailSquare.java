package game.square;

public class GoToJailSquare extends Square {

    public GoToJailSquare(String name, int index){

        this.name = name;

        if(index > 39){
            throw new IllegalArgumentException("out of board");
        }
        this.index = index;
    }
}
