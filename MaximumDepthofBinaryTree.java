public class MaximumDepthofBinaryTree {

    public static void main(String[] args) {
        MaximumDepthofBinaryTree start = new MaximumDepthofBinaryTree();
        TreeNode left1 = new TreeNode(15, null, null);
        TreeNode right2 = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(20, left1, right2);
        TreeNode left = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, left, right);
        System.out.println(start.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int heightLeft = maxDepth(root.left);
        int heightRight = maxDepth(root.right);
        if(heightLeft > heightRight) {
            return ++heightLeft;
        }
        return ++heightRight;
    }
}