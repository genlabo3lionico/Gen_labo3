package game;

import java.util.Random;

public class Die {

    private int faceValue;

    public Die (){
        faceValue = 0;
    }

    public void roll(){

        faceValue = random(2,12);
    }

    public int getFaceValue(){

        return faceValue;
    }

    private int random(int min, int max){

        Random random = new Random();
        return random.nextInt((max-min)+1)+ min;
    }
}
