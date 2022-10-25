package baseball.domain;

import baseball.factory.GameFactory;
import baseball.view.GameViewer;
import java.io.IOException;

public class GameManager {
    private final int numberLong;
    private GameViewer viewer;
    private GameFactory factory;
    private Input input;

    public GameManager(int numberLong) {
        this.numberLong = numberLong;
        this.viewer = GameViewer.getInstance();
        this.factory = new GameFactory();
        this.input = Input.getInstance();
    }

    public Game createBaseBallGame(int numberLong){
        return factory.createBaseballGame(numberLong);
    }

    public int run() {
        Game game = createBaseBallGame(numberLong);
        while(game.isFinished() == false){
            viewer.viewHint( game.play(input) );
        }
        if(input.gameRestartInput() == 1) {
            this.run();
        }
        return 0;
    }
}
