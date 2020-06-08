package software.renato.algo;

/*
Maximum Path Sum in a Binary Tree
Given a binary tree, find the maximum path sum. The path may start and end at any node in the tree.

Example:

Input: Root of below tree
       1
      / \
     2   3
Output: 6

 */
public class BinaryTreeMaxPathSum {

    public int solution(TreeNode node) {
        Result result = new Result();
        result.value = Integer.MIN_VALUE;

        maxSumNode(node, result);

        return result.value;
    }

    private int maxSumNode(TreeNode node, Result result) {
        if (node == null) {
            return 0;
        }

        int maxSumRight = maxSumNode(node.right, result);
        int maxSumLeft = maxSumNode(node.left, result);

        int maxNodeFirst = Math.max(Math.max(maxSumRight, maxSumLeft) + node.val, node.val);

        int maxNode = Math.max(maxNodeFirst, maxSumRight + maxSumLeft + node.val);

        result.value = Math.max(result.value, maxNode);

        return maxNodeFirst;
    }

    private static class Result {
        int value;
    }

}
