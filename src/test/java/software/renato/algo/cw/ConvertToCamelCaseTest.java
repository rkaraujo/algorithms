package software.renato.algo.cw;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "The_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("TheStealthWarrior", ConvertToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
    }

}