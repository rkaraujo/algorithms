package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    public void plusOne_1() {
        assertArrayEquals(new int[] {1,2,4}, plusOne.plusOne(new int[] {1,2,3}));
    }

    @Test
    public void plusOne_2() {
        assertArrayEquals(new int[] {4,3,2,2}, plusOne.plusOne(new int[] {4,3,2,1}));
    }

    @Test
    public void plusOne_3() {
        assertArrayEquals(new int[] {1,0,0}, plusOne.plusOne(new int[] {9,9}));
    }
}