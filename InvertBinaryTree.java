public class InvertBinaryTree {

    static TreeNode root;

    public static void main(String[] args) {
        InvertBinaryTree start = new InvertBinaryTree();

        TreeNode right2 = new TreeNode(9, null, null);
        TreeNode left2 = new TreeNode(6, null, null);
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(1, null, null);
        TreeNode right = new TreeNode(7, left2, right2);
        TreeNode left = new TreeNode(2, left1, right1);
        root = new TreeNode(4, left, right);
        start.invertTree(root);
        TreeNode.printNodes(root);
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
    }
}