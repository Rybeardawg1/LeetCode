public class DiameterofBinaryTree {

    int max = 0;

    public static void main(String[] args) {
        DiameterofBinaryTree start = new DiameterofBinaryTree();
        TreeNode right1 = new TreeNode(5, null, null);
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode left = new TreeNode(2, left1, right1);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(start.diameterOfBinaryTree(root));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        System.out.println(diameter(root));
        return max;
    }

    public int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int heightLeft = diameter(root.left);
        int heightRight = diameter(root.right);
        max = Math.max(max, heightLeft + heightRight);
        return Math.max(heightLeft, heightRight) + 1;
    }
}