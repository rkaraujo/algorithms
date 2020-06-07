package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle = new Triangle();

    @Test
    public void solution_1() {
        Assert.assertEquals(1, triangle.solution(new int[] {10,2,5,1,8,20}));
    }

    @Test
    public void solution_2() {
        Assert.assertEquals(0, triangle.solution(new int[] {10,50,5,1}));
    }

    @Test
    public void solution_3() {
        Assert.assertEquals(0, triangle.solution(new int[] {10}));
    }

    @Test
    public void solution_4() {
        Assert.assertEquals(0, triangle.solution(new int[] {10, 50}));
    }

    @Test
    public void solution_5() {
        Assert.assertEquals(0, triangle.solution(new int[0]));
    }
}