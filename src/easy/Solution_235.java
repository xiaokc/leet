package easy;

/**
 * 二叉搜索树(BST)，即二叉排序树的最近公共祖先，一个节点可以是它自己的孩子节点
 * Created by xkc on 12/14/15.
 */
public class Solution_235 {

    //递归算法
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }

        if ((root.val == p.val) || (root.val == q.val) || (root.val > p.val && root.val < q.val) || (root.val > q.val && root.val < p.val)){
            return root;
        }

        if (root.left == p || root.left == q) {
            return root.left;
        }

        if (root.right == p || root.right == q) {
            return root.right;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        } else {
            return left != null ? left : right;
        }
    }

    //递归算法
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || p == null || q == null){
            return null;
        }

        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor2(root.left,p,q);
        }
        if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor2(root.right,p,q);
        }
        return root;
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
