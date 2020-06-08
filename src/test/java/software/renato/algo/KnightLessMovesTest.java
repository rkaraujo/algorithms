package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightLessMovesTest {

    private KnightLessMoves knight = new KnightLessMoves();

    @Test
    public void solution_1() {
        Assert.assertEquals(6, knight.solution(8, 0, 7, 7, 0));
    }

    @Test
    public void solution_2() {
        Assert.assertEquals(2, knight.solution(8, 2, 4, 6, 4));
    }

    @Test
    public void solution_3() {
        Assert.assertEquals(3, knight.solution(8, 4, 5, 1, 1));
    }
}