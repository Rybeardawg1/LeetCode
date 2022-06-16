public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "\t");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    static void inOrder(TreeNode root) {
        if (root != null) {
            preOrder(root.left);
            System.out.print(root.val + "\t");
            preOrder(root.right);
        }
    }

    static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + "\t");
        }
    }
}