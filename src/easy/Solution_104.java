package easy;

/**
 * Maximum depth of binary tree
 * Created by xkc on 7/27/15.
 */
public class Solution_104 {



    public static void main(String[] args){
        TreeNode rootNode;

        rootNode = new TreeNode(0);
        rootNode.left = new TreeNode(1);
        rootNode.right = new TreeNode(2);

        rootNode.left.left = new TreeNode(3);

        int depth = maxDepth(rootNode);
        System.out.print("depth="+depth);



    }

    /**
     * 求二叉树深度
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        return lDepth > rDepth ? lDepth + 1 : rDepth + 1;
    }


    /**
     * 内部类，定义二叉树结点类型
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

}
