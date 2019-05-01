package game.square;

public abstract class Square {

    protected String name;
    protected int index;

    public int getIndex(){
        return index;
    }

    @Override
    public String toString(){
        return name;
    }
}
