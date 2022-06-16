public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        SubtreeOfAnotherTree start = new SubtreeOfAnotherTree();
        TreeNode right1 = new TreeNode(2, null, null);
        TreeNode left1 = new TreeNode(1, null, null);
        TreeNode right = new TreeNode(5, null, null);
        TreeNode left = new TreeNode(4, left1, right1);
        TreeNode root = new TreeNode(3, left, right);
        System.out.println(start.isSubtree(root, left1));
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (isSame(root, subRoot))
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }

    public boolean isSame(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        } else if (first == null || second == null) {
            return false;
        }
        return isSame(first.left, second.left) && isSame(first.right, second.right);
    }
}