package baseball.view;

public class GameViewer {

    private static GameViewer instance;
    public GameViewer() {
    }

    public static GameViewer getInstance() {
        if(instance == null){
            synchronized (GameViewer.class){
                instance = new GameViewer();
            }
        }
        return instance;
    }

    public void viewHint(int[] hint){

        if(hint[0] == 0 && hint[1] == 0) {
            System.out.printf("낫싱\n");
        } else if (hint[1] == 3) {
            System.out.println("3스트라이크");
            System.out.printf("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
        } else if (hint[0] == 0){
            System.out.printf("%d스트라이크\n", hint[1]);
        }else if ( hint[1] == 0){
            System.out.printf("%d볼\n", hint[0]);
        }else{
            System.out.printf("%d볼 %d스트라이크\n", hint[0], hint[1]);
        }
    }
}
