package software.renato.algo;

import org.junit.Test;
import software.renato.algo.ValidSequenceBinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;

public class ValidSequenceBinaryTreeTest {

    private ValidSequenceBinaryTree validSequenceBinaryTree = new ValidSequenceBinaryTree();

    @Test
    public void testIsValidSequence_example1() {
        int[] tree = {0,1,0,0,1,0,-1,-1,1,0,0};
        int[] arr = {0,1,0,1};

        TreeNode root = buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(true, result);
    }

    @Test
    public void testIsValidSequence_example2() {
        int[] tree = {0,1,0,0,1,0,-1,-1,1,0,0};
        int[] arr = {0,0,1};

        TreeNode root = buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_example3() {
        int[] tree = {0,1,0,0,1,0,-1,-1,1,0,0};
        int[] arr = {0,1,1};

        TreeNode root = buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_test1() {
        int[] tree = {8,3,-1,2,1,5,4};
        int[] arr = {8};

        TreeNode root = buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_test2() {
        int[] tree = {3,0,-1,2,-1,-1,2,9,3};
        int[] arr = {3,0};

        TreeNode root = buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    @Test
    public void testIsValidSequence_test3() {
        int[] tree = {2,9,3,-1,1,-1,2,-1,8};
        int[] arr = {2,9,1,8,0};

        TreeNode root = buildTree(tree);

        boolean result = validSequenceBinaryTree.isValidSequence(root, arr);

        assertEquals(false, result);
    }

    private TreeNode buildTree(int[] tree) {
        TreeNode root = new TreeNode(tree[0]);

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addFirst(root);

        int i = 1;
        while (i < tree.length) {
            TreeNode currentNode = queue.removeLast();

            if (tree[i] != -1) {
                TreeNode left = new TreeNode(tree[i]);
                currentNode.left = left;
                queue.addFirst(left);
            }
            i++;

            if (i < tree.length && tree[i] != -1) {
                TreeNode right = new TreeNode(tree[i]);
                currentNode.right = right;
                queue.addFirst(right);
            }
            i++;
        }

        return root;
    }
}