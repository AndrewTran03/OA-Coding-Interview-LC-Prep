package NeetCode150_ProblemSolving;

public class LowestCommonAncestorOfABST0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root == null || p == null || q == null) {
                return root;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else {
                return root;
            }
        }
    }

    public static void main(String[] args) {
    }
}
