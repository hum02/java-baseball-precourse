package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    NumberGenerator generator = NumberGenerator.getInstance();

    @Test
    void generateComputerNums() {
        int[] nums = generator.generateComputerNums(3);
        System.out.printf("%d %d %d", nums[0],nums[1],nums[2]);
    }
}