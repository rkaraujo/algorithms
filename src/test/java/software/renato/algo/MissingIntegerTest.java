package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    @Test
    public void solution_1() {
        MissingInteger spi = new MissingInteger();
        Assert.assertEquals(5, spi.solution(new int[] {1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void solution_2() {
        MissingInteger spi = new MissingInteger();
        Assert.assertEquals(4, spi.solution(new int[] {1, 2, 3}));
    }

    @Test
    public void solution_3() {
        MissingInteger spi = new MissingInteger();
        Assert.assertEquals(1, spi.solution(new int[] {-1, -3}));
    }
}