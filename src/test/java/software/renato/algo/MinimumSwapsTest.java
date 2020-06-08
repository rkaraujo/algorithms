package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapsTest {

    private MinimumSwaps ms = new MinimumSwaps();

    @Test
    public void solution_1() {
        Assert.assertEquals(5, ms.solution(new int[] {7, 1, 3, 2, 4, 5, 6}));
    }

    @Test
    public void solution_2() {
        Assert.assertEquals(3, ms.solution(new int[] {4, 3, 1, 2}));
    }

    @Test
    public void solution_3() {
        Assert.assertEquals(3, ms.solution(new int[] {2, 3, 4, 1, 5}));
    }
}