package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidSequenceBinaryTreeTest {

    private ValidSequenceBinaryTree validSequenceBinaryTree = new ValidSequenceBinaryTree();

    @Test
    public void testIsValidSequence_example1() {
        Integer[] tree = {0,1,0,0,1,0,null,null,1,0,0};
        int[] arr = {0,1,0,1};

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(true, result);
    }

    @Test
    public void testIsValidSequence_example2() {
        Integer[] tree = {0,1,0,0,1,0,null,null,1,0,0};
        int[] arr = {0,0,1};

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_example3() {
        Integer[] tree = {0,1,0,0,1,0,null,null,1,0,0};
        int[] arr = {0,1,1};

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_test1() {
        Integer[] tree = {8,3,null,2,1,5,4};
        int[] arr = {8};

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_test2() {
        Integer[] tree = {3,0,null,2,null,null,2,9,3};
        int[] arr = {3,0};

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_test3() {
        Integer[] tree = {2,9,3,null,1,null,2,null,8};
        int[] arr = {2,9,1,8,0};

        TreeNode root = TestUtil.buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

}