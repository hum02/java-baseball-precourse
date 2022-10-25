package baseball;

import baseball.domain.Game;
import baseball.domain.GameManager;
import baseball.domain.HintGenerator;
import baseball.domain.NumberGenerator;
import baseball.factory.GameFactory;
import baseball.view.GameViewer;

public class Application {
    public static void main(String[] args) {
        int numberLong = 3;
        GameManager manager = new GameManager(numberLong);
        manager.run();
    }
}
