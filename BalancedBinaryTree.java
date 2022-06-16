public class BalancedBinaryTree {

    public static void main(String[] args) {
        BalancedBinaryTree start = new BalancedBinaryTree();
        TreeNode right1 = new TreeNode(7, null, null);
        TreeNode left1 = new TreeNode(15, null, null);
        TreeNode right = new TreeNode(20, left1, right1);
        TreeNode left = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, left, right);
        System.out.println(start.isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isBalanced(root.left)) {
            return false;
        }
        if (!isBalanced(root.right)) {
            return false;
        }        
        int diff = maxDepth(root.left) - maxDepth(root.right);
        return diff > -2 && diff < 2 ? true : false;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int heightLeft = maxDepth(root.left);
        int heightRight = maxDepth(root.right);
        if (heightLeft > heightRight) {
            return ++heightLeft;
        }
        return ++heightRight;
    }
}