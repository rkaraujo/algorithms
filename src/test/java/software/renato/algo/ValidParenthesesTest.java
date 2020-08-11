package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void isValid_1() {
        Assert.assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void isValid_2() {
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void isValid_3() {
        Assert.assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void isValid_4() {
        Assert.assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void isValid_5() {
        Assert.assertTrue(validParentheses.isValid("{[]}"));
    }

}