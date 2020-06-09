package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceTest {

    private IsSubsequence classToTest = new IsSubsequence();

    @Test
    public void isSubsequence_1() {
        assertTrue(classToTest.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void isSubsequence_2() {
        assertFalse(classToTest.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void isSubsequence_3() {
        assertFalse(classToTest.isSubsequence("", ""));
    }
}