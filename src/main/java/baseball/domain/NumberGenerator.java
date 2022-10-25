package baseball.domain;
import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {
    private static NumberGenerator instace;

    public NumberGenerator() {
    }

    public static NumberGenerator getInstance(){
        if(instace == null){
            synchronized (NumberGenerator.class){
                instace = new NumberGenerator();
            }
        }
        return instace;
    }


    public int[] generateComputerNums(int numberLong){


        int[] nums = new int[numberLong];

        nums[0] = Randoms.pickNumberInRange(1,9);
        nums[1] = Randoms.pickNumberInRange(1,9);
        while(nums[0] == nums[1]){
            nums[1] = Randoms.pickNumberInRange(1,9);
        }

        nums[2] = Randoms.pickNumberInRange(1,9);
        while(nums[2] == nums[0] || nums[2] == nums[1]){
            nums[2] = Randoms.pickNumberInRange(1,9);
        }
        return nums;
    }
}
