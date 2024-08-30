package NeetCode150_ProblemSolving;

import java.util.*;

public class BinaryTreeLevelOrderTraversal0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        if (root != null) {
            bfsQueue.offer(root);
        }

        while (!bfsQueue.isEmpty()) {
            List<Integer> values = new ArrayList<>();
            final int queueSize = bfsQueue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = bfsQueue.poll();
                values.add(node.val);
                if (node.left != null) {
                    bfsQueue.offer(node.left);
                }
                if (node.right != null) {
                    bfsQueue.offer(node.right);
                }
            }
            result.add(values);
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
