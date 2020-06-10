package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void searchInsert_1() {
        assertEquals(2, searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 5));
    }

    @Test
    public void searchInsert_2() {
        assertEquals(1, searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 2));
    }

    @Test
    public void searchInsert_3() {
        assertEquals(4, searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 7));
    }

    @Test
    public void searchInsert_4() {
        assertEquals(0, searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 0));
    }

    @Test
    public void searchInsert_5() {
        assertEquals(1, searchInsertPosition.searchInsert(new int[] {1,3}, 2));
    }
}