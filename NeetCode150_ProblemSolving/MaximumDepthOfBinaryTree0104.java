package NeetCode150_ProblemSolving;

import java.util.*;

public class MaximumDepthOfBinaryTree0104 {
    // RECURSIVE DFS
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // BFS
    public int maxDepth2(TreeNode root) {
        int level = 0;
        Deque<TreeNode> bfsQueue = new ArrayDeque<>();
        if (root != null) {
            bfsQueue.offer(root);
        }

        while (!bfsQueue.isEmpty()) {
            final int queueSize = bfsQueue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = bfsQueue.poll();
                if (node == null) {
                    break;
                }
                if (node.left != null) {
                    bfsQueue.offer(node.left);
                }
                if (node.right != null) {
                    bfsQueue.offer(node.right);
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
    }
}
