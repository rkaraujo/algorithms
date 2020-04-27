package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test() {
        int param1 = 2147483646;
        int param2 = 2147483647;

        int result = solution.rangeBitwiseAnd(param1, param2);

        int expected = 2147483646;

        Assert.assertEquals(expected, result);
    }

}