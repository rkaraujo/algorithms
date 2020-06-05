package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestPositiveIntegerTest {

    @Test
    public void solution_1() {
        SmallestPositiveInteger spi = new SmallestPositiveInteger();
        Assert.assertEquals(5, spi.solution(new int[] {1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void solution_2() {
        SmallestPositiveInteger spi = new SmallestPositiveInteger();
        Assert.assertEquals(4, spi.solution(new int[] {1, 2, 3}));
    }

    @Test
    public void solution_3() {
        SmallestPositiveInteger spi = new SmallestPositiveInteger();
        Assert.assertEquals(1, spi.solution(new int[] {-1, -3}));
    }
}