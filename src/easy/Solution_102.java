package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal
 * 二叉树层次遍历
 * Created by xkc on 3/21/16.
 */
public class Solution_102 {

    //使用广度优先搜索进行层次遍历
    public static List<List<Integer>> bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if (root == null){
            return wrapList;
        }

        queue.offer(root);//元素插到链表表尾
        while (! queue.isEmpty()){
            int levelNum = queue.size();//levelNum表示每一层的元素数
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i ++){
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }

                if (queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }


                subList.add(queue.poll().val);

            }

//            wrapList.add(subList);
            wrapList.add(0,subList);

        }

        return wrapList;


    }

    //使用深度优先搜索进行层次遍历
    public static List<List<Integer>> dfs(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<>();
        levelMaker(wrapList, root, 0);
        return wrapList;

    }

    public static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level >= list.size()) {
            list.add(0, new LinkedList<>());
        }

        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 2);

        list.get(list.size() - level - 1).add(root.val);

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
