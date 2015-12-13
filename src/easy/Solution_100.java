package easy;

/**
 * 判断两个二叉树是否相等，采用递归方式
 * Created by xkc on 12/12/15.
 */
public class Solution_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //如果一棵树为空，另一棵不为空
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        //两个都是空树
        if (p == null && q == null){
            return true;
        }

        //对应节点的值相等，递归判断左右子树
        if (p.val == q.val) {

            boolean isLeftSame = isSameTree(p.left, q.left);
            boolean isRightSame = isSameTree(p.right, q.right);

            return (isLeftSame && isRightSame);
        }
        return false;
    }

    // Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}



