package game;

public class Piece {

    private final String name;
    private Square square;

    public Piece(String name, Square initialLocation){
        this.name = name;
        square = initialLocation;
    }

    public void setLocation(Square newSquare){
        square = newSquare;
    }

    public Square getLocation(){
        return square;
    }

    public String getName() {
        return name;
    }

}
