package baseball.domain;

public class HintGenerator {
    int numberLong;

    private static HintGenerator innstance;
    private int[] answer;

    public HintGenerator(int numberLong,int[] computerNums) {
        this.numberLong = numberLong;
        this.answer = computerNums;
    }

    public int[] generateHint(String guessNum){
        int[] hint = new int[2];
        int ball= 0;
        int strike= 0;

        int[] guess = new int[this.numberLong];

        for(int i=0;i<guessNum.length();i++){
            guess[i] = guessNum.charAt(i)-'0';
        }

        System.out.printf("%d %d %d", answer[0],answer[1],answer[2]);

        for(int i=0;i<numberLong;i++){
            int[] ballStrike = countBallStrike(guess,i);
            strike+=ballStrike[0];
            ball+=ballStrike[1];
        }
        hint[0] = ball;
        hint[1] = strike;

        return hint;
    }

    private int[] countBallStrike(int[] guess, int i){
        int[] ballStrike = new int[2];

        for(int j=0; j< numberLong; j++){
            if(answer[i] == guess[j]){
                if(i == j){
                    ++ballStrike[0];
                }
                else{
                    ++ballStrike[1];
                }
            }
        }
        return ballStrike;
    }
}
