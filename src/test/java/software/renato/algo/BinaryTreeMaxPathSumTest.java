package software.renato.algo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeMaxPathSumTest {

    private BinaryTreeMaxPathSum btmps = new BinaryTreeMaxPathSum();

    @Test
    public void solution_1() {
        Integer[] tree = {1,2,3};
        TreeNode root = TestUtil.buildTree(tree);
        Assert.assertEquals(6, btmps.solution(root));
    }

    @Test
    public void solution_2() {
        Integer[] tree = {-10,9,20,null,null,15,7};
        TreeNode root = TestUtil.buildTree(tree);
        Assert.assertEquals(42, btmps.solution(root));
    }

    @Test
    public void solution_3() {
        Integer[] tree = {10,2,10,20,1,null,-25,null,null,null,null,3,4};
        TreeNode root = TestUtil.buildTree(tree);
        Assert.assertEquals(42, btmps.solution(root));
    }

    @Test
    public void solution_4() {
        Integer[] tree = {-3};
        TreeNode root = TestUtil.buildTree(tree);
        Assert.assertEquals(-3, btmps.solution(root));
    }
}