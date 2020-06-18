package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class HIndex2Test {

    private HIndex2 hIndex2 = new HIndex2();

    @Test
    public void hIndex_1() {
        assertEquals(3, hIndex2.hIndex(new int[] {0,1,3,5,6}));
    }

    @Test
    public void hIndex_2() {
        assertEquals(6, hIndex2.hIndex(new int[] {4,5,6,7,15,20,30,33}));
    }

    @Test
    public void hIndex_3() {
        assertEquals(8, hIndex2.hIndex(new int[] {1,4,6,8,9,10,15,19,32,46,70,87}));
    }

    @Test
    public void hIndex_4() {
        assertEquals(0, hIndex2.hIndex(new int[] {0}));
    }

    @Test
    public void hIndex_5() {
        assertEquals(1, hIndex2.hIndex(new int[] {1}));
    }
}