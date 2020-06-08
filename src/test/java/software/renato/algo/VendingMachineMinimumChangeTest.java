package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineMinimumChangeTest {

    private VendingMachineMinimumChange vending = new VendingMachineMinimumChange();

    @Test
    public void solution_1() {
        assertEquals(1, vending.solution(1, 2));
    }

    @Test
    public void solution_2() {
        assertEquals(3, vending.solution(1, 4));
    }

    @Test
    public void solution_3() {
        assertEquals(2, vending.solution(1, 2.5));
    }

    @Test
    public void solution_4() {
        assertEquals(3, vending.solution(1, 2.75));
    }
}