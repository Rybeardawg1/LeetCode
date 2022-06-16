public class LowestCommonAncestor {

    public static void main(String[] args) {
        LowestCommonAncestor start = new LowestCommonAncestor();
        TreeNode right3 = new TreeNode(5, null, null);
        TreeNode left3 = new TreeNode(3, null, null);
        TreeNode right2 = new TreeNode(9, null, null);
        TreeNode left2 = new TreeNode(7, null, null);
        TreeNode right1 = new TreeNode(4, left3, right3);
        TreeNode left1 = new TreeNode(0, null, null);
        TreeNode right = new TreeNode(8, left2, right2);
        TreeNode left = new TreeNode(2, left1, right1);
        TreeNode root = new TreeNode(6, left, right);
        TreeNode.inOrder(start.lowestCommonAncestor(root, left, right));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val)
            return root;
        else if (root.val < q.val && root.val < p.val)
            lowestCommonAncestor(root.right, p, q);
        else if (root.val > q.val && root.val > p.val)
            lowestCommonAncestor(root.left, p, q);
        return root;
    }
}