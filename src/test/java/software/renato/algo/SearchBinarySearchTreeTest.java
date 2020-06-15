package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchBinarySearchTreeTest {

    private SearchBinarySearchTree searchBinarySearchTree = new SearchBinarySearchTree();

    @Test
    public void searchBST_1() {
        TreeNode root = TestUtil.buildTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 2;
        TreeNode node = searchBinarySearchTree.searchBST(root, val);
        assertEquals(val, node.val);
    }

    @Test
    public void searchBST_2() {
        TreeNode root = TestUtil.buildTree(new Integer[]{2,1,3});
        int val = 5;
        TreeNode node = searchBinarySearchTree.searchBST(root, val);
        assertNull(node);
    }

    @Test
    public void searchBST_3() {
        TreeNode root = null;
        int val = 5;
        TreeNode node = searchBinarySearchTree.searchBST(root, val);
        assertNull(node);
    }

    @Test
    public void searchBST_iterative_1() {
        TreeNode root = TestUtil.buildTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 2;
        TreeNode node = searchBinarySearchTree.searchBST_iterative(root, val);
        assertEquals(val, node.val);
    }

    @Test
    public void searchBST_iterative_2() {
        TreeNode root = TestUtil.buildTree(new Integer[]{2,1,3});
        int val = 5;
        TreeNode node = searchBinarySearchTree.searchBST_iterative(root, val);
        assertNull(node);
    }

    @Test
    public void searchBST_iterative_3() {
        TreeNode root = null;
        int val = 5;
        TreeNode node = searchBinarySearchTree.searchBST_iterative(root, val);
        assertNull(node);
    }
}