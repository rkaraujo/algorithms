package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

    @Test
    public void testFirstBadVersion_1() {
        int n = 5;
        int expectedFirstBadVersion = 4;

        FirstBadVersion solution = new FirstBadVersion(badVersion -> badVersion >= expectedFirstBadVersion);

        int firstBadVersion = solution.firstBadVersion(n);

        assertEquals(expectedFirstBadVersion, firstBadVersion);
    }

    @Test
    public void testFirstBadVersion_2() {
        int n = 2;
        int expectedFirstBadVersion = 2;

        FirstBadVersion solution = new FirstBadVersion(badVersion -> badVersion >= expectedFirstBadVersion);

        int firstBadVersion = solution.firstBadVersion(n);

        assertEquals(expectedFirstBadVersion, firstBadVersion);
    }

    @Test
    public void testFirstBadVersion_3() {
        int n = 2126753390;
        int expectedFirstBadVersion = 1702766719;

        FirstBadVersion solution = new FirstBadVersion(badVersion -> badVersion >= expectedFirstBadVersion);

        int firstBadVersion = solution.firstBadVersion(n);

        assertEquals(expectedFirstBadVersion, firstBadVersion);
    }

}