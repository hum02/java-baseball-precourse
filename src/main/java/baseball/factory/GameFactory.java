package baseball.factory;

import baseball.domain.Game;
import baseball.domain.NumberGenerator;

public class GameFactory {
    NumberGenerator numberGenerator;
    public GameFactory() {
        this.numberGenerator = NumberGenerator.getInstance();
    }

    public Game createBaseballGame(int numberLong){
        int[] computerNums = numberGenerator.generateComputerNums(numberLong);
        return new Game(numberLong, computerNums);
    }
}
