package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.addFirst(root);

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.removeLast();

            TreeNode nextRight = node.left;
            TreeNode nextLeft = node.right;

            node.right = nextRight;
            if (nextRight != null) {
                nodeQueue.addFirst(nextRight);
            }

            node.left = nextLeft;
            if (nextLeft != null) {
                nodeQueue.addFirst(nextLeft);
            }
        }

        return root;
    }

}
