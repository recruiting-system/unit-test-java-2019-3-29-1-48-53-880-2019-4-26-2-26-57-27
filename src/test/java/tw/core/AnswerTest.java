package tw.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {

    @Test
    public void create_answer_from_string_to_list_test() {
        String inputStr = "2 3 4 5";
        Answer answer = Answer.createAnswer(inputStr);
        Assert.assertEquals(answer.getIndexOfNum("2"), 0);
        Assert.assertEquals(answer.getIndexOfNum("3"), 1);
        Assert.assertEquals(answer.getIndexOfNum("4"), 2);
        Assert.assertEquals(answer.getIndexOfNum("5"), 3);
    }

    @Test
    public void create_answer_from_string_to_list_test_two() {
        String inputStr = "1 2 3 4";
        Answer answer = Answer.createAnswer(inputStr);
        Assert.assertEquals(answer.toString(),inputStr);
    }

    @Test
    public void check_input_and_out_put_result() {
        Answer answer = new Answer();
        answer.setNumList(Arrays.asList("1", "2", "3", "4"));
        Assert.assertEquals(answer.check(answer).getValue(), "4A0B");
    }
}
