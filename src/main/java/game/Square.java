
package game;

public class Square {

    private String name;
    private final int index;

    public Square(String name, int index){
        this.name = name;
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
