package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum classToTest = new TwoSum();

    @Test
    public void twoSum() {
        assertArrayEquals(new int[] {0,1}, classToTest.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}