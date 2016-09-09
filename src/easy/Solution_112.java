package easy;

/**
 * Created by xkc on 8/29/16.
 */
public class Solution_112 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = null;
        node3.left = null;
        node3.right = null;
        node4.left = null;
        node4.right = null;

//        depthVisit(node1);
        System.out.println(hasPathSum(node1,4));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return (root.val == sum);
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }

    public static void depthVisit(TreeNode root) {

        if (root == null) {
            return;
        } else {
            System.out.println(root.val);
        }

        depthVisit(root.left);
        depthVisit(root.right);


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }
}
