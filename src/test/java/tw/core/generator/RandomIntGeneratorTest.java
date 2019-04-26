package tw.core.generator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomIntGeneratorTest {

    @Test
    public void generate_initialization_nums_test() {
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        Integer digitmax = 9;
        Integer numbersOfNeed = 4;
        Assert.assertEquals(randomIntGenerator.generateNums(digitmax, numbersOfNeed).split(" ").length, 4);
    }
}
