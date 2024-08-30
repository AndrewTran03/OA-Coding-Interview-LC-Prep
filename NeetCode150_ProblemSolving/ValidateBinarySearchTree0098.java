package NeetCode150_ProblemSolving;


public class ValidateBinarySearchTree0098 {
    public boolean isValidBST(TreeNode root) {
        return validHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validHelper(TreeNode node, long lowerLimit, long upperLimit) {
        if (node == null) {
            return true;
        } else if (!(lowerLimit < node.val && node.val < upperLimit)) {
            return false;
        }

        return validHelper(node.left, lowerLimit, node.val) && validHelper(node.right, node.val, upperLimit);
    }

    public static void main(String[] args) {
    }
}
