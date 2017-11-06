package easy;

import java.util.Stack;

/**
 * 判断一棵二叉树是否是对称二叉树
 * Created by xkc on 3/10/16.
 */
public class Solution101_CheckSymmetricBiTree {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isCheck(root.left, root.right);
    }

    //递归
    private boolean isCheck(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;


        if (left.val == right.val) {
            return isCheck(left.left, right.right) && isCheck(left.right, right.left);
        } else {
            return false;
        }

    }


    //非递归，用栈实现
    private boolean isSymmetric_no_recursive(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode left, right;

        if (root.left != null){
            if (root.right == null){
                return false;
            }
            stack.push(root.left);
            stack.push(root.right);

        }else if (root.right != null){
            return false;
        }

        while (! stack.empty()){
            if (stack.size() % 2 != 0){
                return false;
            }
            right = stack.pop();
            left = stack.pop();

            if (right.val != left.val){
                return false;
            }

            if (left.left != null){
                if (right.right == null){
                    return false;
                }
                stack.push(left.left);
                stack.push(right.right);
            }else if (right.right != null){
                return false;
            }

            if (left.right != null){
                if (right.left == null){
                    return false;
                }

                stack.push(left.right);
                stack.push(right.left);

            }else if (right.left != null){
                return false;
            }


        }

        return true;

    }


}
