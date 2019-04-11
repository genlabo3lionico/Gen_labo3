package game;

import java.util.Random;

public class Die {

    private Random random = new Random();

    private int faceValue;

    public Die (){
        faceValue = 0;
    }

    public void roll(){

        faceValue = random(1,6);
    }

    public int getFaceValue(){

        return faceValue;
    }

    private int random(int min, int max){

        return random.nextInt(max)+ min;
    }
}
