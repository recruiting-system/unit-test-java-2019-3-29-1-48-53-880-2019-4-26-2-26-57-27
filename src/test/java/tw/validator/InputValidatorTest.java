package tw.validator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputValidatorTest {

    @Test
    public void validate_success_test() {
        InputValidator inputValidator = new InputValidator();
        Assert.assertEquals(inputValidator.validate("1 3 4 5"), true);
    }

    @Test
    public void validate_fail_test() {
        InputValidator inputValidator = new InputValidator();
        Assert.assertEquals(inputValidator.validate("1 3 3 5"), false);
    }

    @Test
    public void validate_fail_test_two() {
        InputValidator inputValidator = new InputValidator();
        Assert.assertEquals(inputValidator.validate("1 33 5"), false);
    }
}
