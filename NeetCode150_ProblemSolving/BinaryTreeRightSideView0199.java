package NeetCode150_ProblemSolving;

import java.util.*;

public class BinaryTreeRightSideView0199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> bfsQueue = new ArrayDeque<>();
        if (root != null) {
            bfsQueue.offer(root);
        }

        while (!bfsQueue.isEmpty()) {
            TreeNode rightSide = null;
            final int queueSize = bfsQueue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = bfsQueue.poll();
                if (node != null) {
                    rightSide = node;
                    if (node.left != null) {
                        bfsQueue.offer(node.left);
                    }
                    if (node.right != null) {
                        bfsQueue.offer(node.right);
                    }
                }
            }
            if (rightSide != null) {
                result.add(rightSide.val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
