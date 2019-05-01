package game;

public class Square {

    private String name;
    private final int index;

    public Square(String name, int index){
        this.name = name;

        if(index > 39){

            throw new IllegalArgumentException("out of board");
        }

        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    @Override
    public String toString(){
        return name;
    }
}
