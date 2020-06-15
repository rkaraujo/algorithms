package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

For example,

Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2
You should return this subtree:

      2
     / \
    1   3
In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.
 */
public class SearchBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        int nodeVal = root.val;
        if (nodeVal == val) {
            return root;
        }

        if (val < nodeVal) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public TreeNode searchBST_iterative(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> nodesToCheck = new ArrayDeque<>();
        nodesToCheck.addFirst(root);

        while (!nodesToCheck.isEmpty()) {
            TreeNode node = nodesToCheck.removeLast();
            if (val == node.val) {
                return node;
            }
            if (val < node.val && node.left != null) {
                nodesToCheck.addFirst(node.left);
            } else if (node.right != null) {
                nodesToCheck.addFirst(node.right);
            }
        }

        return null;
    }
}
