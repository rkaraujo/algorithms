package software.renato.algo;

/*
Given a binary tree where each path going from the root to any leaf form a valid sequence, check if a given string is a valid sequence in such binary tree.

We get the given string from the concatenation of an array of integers arr and the concatenation of all values of the nodes along a path results in a sequence in the given binary tree.



Example 1:



Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
Output: true
Explanation:
The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in the figure).
Other valid sequences are:
0 -> 1 -> 1 -> 0
0 -> 0 -> 0
Example 2:



Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
Output: false
Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a sequence.
Example 3:



Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1]
Output: false
Explanation: The path 0 -> 1 -> 1 is a sequence, but it is not a valid sequence.


Constraints:

1 <= arr.length <= 5000
0 <= arr[i] <= 9
Each node's value is between [0 - 9].
 */
public class ValidSequenceBinaryTree {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (root == null || arr.length == 0) {
            return false;
        }
        return isValid(root, arr, 0);
    }

    private boolean isValid(TreeNode node, int[] arr, int index) {
        if (node == null || index >= arr.length) {
            return false;
        }

        boolean isLeaf = node.left == null && node.right == null;
        if (isLeaf) {
            boolean isLastArrElement = index == arr.length - 1;
            return node.val == arr[index] && isLastArrElement;
        }

        return node.val == arr[index] &&
                (isValid(node.left, arr, index + 1) || isValid(node.right, arr, index + 1));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
