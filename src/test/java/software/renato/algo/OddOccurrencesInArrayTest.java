package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray ooa = new OddOccurrencesInArray();

    @Test
    public void solution_1() {
        Assert.assertEquals(7, ooa.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void solution_2() {
        Assert.assertEquals(7, ooa.solution(new int[] {7}));
    }
}