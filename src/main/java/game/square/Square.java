package game.square;

public abstract class Square {

    protected String name;
    protected int index;

    Square(String name, int index){
        this.name = name;
        if(index > 39){
            throw new IllegalArgumentException("out of board");
        }
        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    public String getName(){
        return name;
    }
}
