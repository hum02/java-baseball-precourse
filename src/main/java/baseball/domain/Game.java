package baseball.domain;

import java.io.IOException;

public class Game {
    private boolean isFinished = false;
    private HintGenerator hintGenerator;
    public Game(int numberLong, int[] computerNums){
        this.hintGenerator = new HintGenerator(numberLong, computerNums);
    }

    public int[] play(Input input) {
        String guessNum = input.guessBaseballNum();
        int[] hint = hintGenerator.generateHint(guessNum);
        if(hint[1]== hintGenerator.numberLong){
            this.isFinished = true;
        }
        return hint;
    }

    public boolean isFinished(){
        return isFinished;
    }
}
