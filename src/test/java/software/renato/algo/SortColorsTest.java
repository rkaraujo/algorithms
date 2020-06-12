package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortColorsTest {

    private SortColors sortColors = new SortColors();

    @Test
    public void sortColors_1() {
        int[] colors = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(colors);
        assertArrayEquals(new int[] {0,0,1,1,2,2}, colors);
    }
}