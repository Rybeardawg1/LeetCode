public class SameTree {
    public static void main(String[] args) {
        SameTree start = new SameTree();
        TreeNode right1 = new TreeNode(2, null, null);
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode left = new TreeNode(2, left1, null);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(start.isSameTree(root, root));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}