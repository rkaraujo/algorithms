package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void test() {
        String[] input1 = new String[] {"LRUCache","put","put","put","put","get","get"};
        int[][] input2 = new int[][] {{2},{2,1},{1,1},{2,3},{4,1},{1},{2}};
        Integer[] expected = new Integer[] {null,null,null,null,null,-1,3};

        // capacity=2
        // put(2,1)
        // put(1,1)
        // put(2,3)
        // put(4,1)
        // get(1)
        // get(2)

        int capacity = input2[0][0];
        LRUCache cache = new LRUCache(capacity);

        for (int i = 1; i < input1.length; i++) {
            String command = input1[i];
            if ("put".equals(command)) {
                cache.put(input2[i][0], input2[i][1]);
            }
            else if ("get".equals(command)) {
                Integer value = cache.get(input2[i][0]);
                assertEquals(expected[i], value);
            }
        }
    }

}