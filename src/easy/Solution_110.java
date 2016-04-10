package easy;

/**
 * 判断是否是平衡二叉树
 * Created by xkc on 3/10/16.
 */
public class Solution_110 {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    private int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
