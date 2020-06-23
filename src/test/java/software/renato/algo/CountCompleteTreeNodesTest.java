package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountCompleteTreeNodesTest {

    private CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();

    @Test
    public void countNodes_1() {
        Integer[] tree = {1,2,3,4,5,6};
        TreeNode root = TestUtil.buildTree(tree);
        assertEquals(6, countCompleteTreeNodes.countNodes(root));
    }
}