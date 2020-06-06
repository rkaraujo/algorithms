package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    private TapeEquilibrium te = new TapeEquilibrium();

    @Test
    public void solution_1() {
        assertEquals(1, te.solution(new int[] {3,1,2,4,3}));
    }

    @Test
    public void solution_2() {
        assertEquals(10, te.solution(new int[] {10,0}));
    }
}