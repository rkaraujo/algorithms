package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;

/*
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.



Example 1:


Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:


Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:



Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false


Note:

The number of nodes in the tree will be between 2 and 100.
Each node has a unique integer value from 1 to 100.
*/
public class CousinsBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {
        int heightX = -1;
        TreeNode parentX = null;

        int heightY = -1;
        TreeNode parentY = null;

        Deque<TreeNodeInfo> queue = new ArrayDeque<>();
        queue.add(new TreeNodeInfo(root, null, 0));

        while (queue.size() > 0) {
            TreeNodeInfo nodeInfo = queue.removeLast();
            TreeNode node = nodeInfo.node;
            int height = nodeInfo.height;

            if (node.val == x) {
                heightX = height;
                parentX = nodeInfo.parent;
            } else if (node.val == y) {
                heightY = height;
                parentY = nodeInfo.parent;
            }

            if (heightX != -1 && heightY != -1) {
                break;
            }

            if (node.left != null) {
                queue.addFirst(new TreeNodeInfo(node.left, node, height+1));
            }
            if (node.right != null) {
                queue.addFirst(new TreeNodeInfo(node.right, node,height+1));
            }
        }

        return heightX == heightY && parentX != parentY;
    }

    private static class TreeNodeInfo {
        public TreeNode node;
        public TreeNode parent;
        public int height;
        public TreeNodeInfo(TreeNode node, TreeNode parent, int height) {
            this.node = node;
            this.parent = parent;
            this.height = height;
        }
    }

}
