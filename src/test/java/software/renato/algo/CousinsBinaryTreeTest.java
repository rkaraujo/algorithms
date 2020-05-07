package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CousinsBinaryTreeTest {

    private CousinsBinaryTree solution = new CousinsBinaryTree();

    @Test
    public void isCousins_sameParent() {
        Integer[] tree = {1,2,3,null,4};
        int x = 2;
        int y = 3;

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = solution.isCousins(root, x, y);

        assertFalse(result);
    }
}