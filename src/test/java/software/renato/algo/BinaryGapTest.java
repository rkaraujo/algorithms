package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void solution_1() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(2, bg.solution(9));
    }

    @Test
    public void solution_2() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(4, bg.solution(529));
    }

    @Test
    public void solution_3() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(1, bg.solution(20));
    }

    @Test
    public void solution_4() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(0, bg.solution(15));
    }

    @Test
    public void solution_5() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(0, bg.solution(32));
    }

    @Test
    public void solution_6() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(5, bg.solution(1041));
    }
}