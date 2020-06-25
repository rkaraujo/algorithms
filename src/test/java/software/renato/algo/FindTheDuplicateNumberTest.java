package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDuplicateNumberTest {

    private FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

    @Test
    public void findDuplicate_1() {
        assertEquals(2, findTheDuplicateNumber.findDuplicate(new int[] {1,3,4,2,2}));
    }

    @Test
    public void findDuplicate_2() {
        assertEquals(3, findTheDuplicateNumber.findDuplicate(new int[] {3,1,3,4,2}));
    }
}