package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树反转
 * Created by xkc on 12/12/15.
 */
public class Solution_226 {
    //递归方式
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);


        return root;

    }


    //非递归方式，借助于栈实现层次遍历
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            TreeNode temp = stack.lastElement();
            stack.pop();
            TreeNode tempLeft = temp.left;
            temp.left = temp.right;
            temp.right = tempLeft;

            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }


        return root;

    }

    //非递归方式，借助于队列实现层次遍历
    public TreeNode invertTree3(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//加入元素
        while (queue.size() > 0){
            TreeNode temp = queue.poll();//获取并移出元素

            TreeNode tempLeft = temp.left;
            temp.left = temp.right;
            temp.right = tempLeft;

            if (temp.left != null){
                queue.offer(temp.left);
            }
            if (temp.right != null){
                queue.offer(temp.right);
            }
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




