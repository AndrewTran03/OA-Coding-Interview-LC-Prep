package NeetCode150_ProblemSolving;

public class SubtreeOfAnotherTree0572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        } else if (root == null) {
            return false;
        }

        if (sameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    } 

    private boolean sameTree(TreeNode root, TreeNode other) {
        if (root == null && other == null) {
            return true;
        } else if ((root == null && other != null) || (root != null && other == null)) {
            return false;
        }

        return root.val == other.val && sameTree(root.left, other.left) && sameTree(root.right, other.right);
    }

    public static void main(String[] args) {
    }
}
