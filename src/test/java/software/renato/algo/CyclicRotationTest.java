package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    private CyclicRotation cr = new CyclicRotation();

    @Test
    public void solution_1() {
        Assert.assertArrayEquals(new int[] {9, 7, 6, 3, 8}, cr.solution(new int[] {3, 8, 9, 7, 6}, 3));
    }

    @Test
    public void solution_2() {
        Assert.assertArrayEquals(new int[] {0, 0, 0}, cr.solution(new int[] {0, 0, 0}, 1));
    }

    @Test
    public void solution_3() {
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4}, cr.solution(new int[] {1, 2, 3, 4}, 4));
    }

    @Test
    public void solution_4() {
        Assert.assertArrayEquals(new int[0], cr.solution(new int[0], 4));
    }
}