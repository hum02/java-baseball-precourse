package baseball.domain;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {

    private static Input instance;
    public Input(){
    }

    public static Input getInstance(){
        if(instance == null){
            synchronized (Input.class){
                instance = new Input();
            }
        }
        return instance;
    }

    public int gameRestartInput() throws IllegalArgumentException {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = readLine();
        int gameRestartNum = Integer.parseInt(input);

        if(gameRestartNum != 1 && gameRestartNum !=2){
            throw new IllegalArgumentException("잘못된 입력값입니다");
        }
        return gameRestartNum;
    }
    public String guessBaseballNum() throws IllegalArgumentException{
        System.out.print("숫자를 입력해주세요 : ");
        String guessNum = readLine();

        if(guessNum.length()!=3){
            throw new IllegalArgumentException("잘못된 입력값입니다");
        }

        return guessNum;
    }

}
