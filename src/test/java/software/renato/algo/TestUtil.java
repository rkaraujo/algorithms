package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestUtil {

    public static TreeNode buildTree(Integer[] tree) {
        TreeNode root = new TreeNode(tree[0]);

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addFirst(root);

        int i = 1;
        while (i < tree.length) {
            TreeNode currentNode = queue.removeLast();

            if (tree[i] != null) {
                TreeNode left = new TreeNode(tree[i]);
                currentNode.left = left;
                queue.addFirst(left);
            }
            i++;

            if (i < tree.length && tree[i] != null) {
                TreeNode right = new TreeNode(tree[i]);
                currentNode.right = right;
                queue.addFirst(right);
            }
            i++;
        }

        return root;
    }

}
