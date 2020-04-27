package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    public void longestCommonSubsequence_1() {
        String param1 = "abcde";
        String param2 = "ace";

        int result = solution.longestCommonSubsequence(param1, param2);

        int expected = 3;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void longestCommonSubsequence_2() {
        String param1 = "abc";
        String param2 = "abc";

        int result = solution.longestCommonSubsequence(param1, param2);

        int expected = 3;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void longestCommonSubsequence_3() {
        String param1 = "abc";
        String param2 = "def";

        int result = solution.longestCommonSubsequence(param1, param2);

        int expected = 0;

        Assert.assertEquals(expected, result);
    }
}