package NeetCode150_ProblemSolving;

import java.util.*;;

public class LongestConsecutiveSequence0128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxSequence = 0;
        for (int num : nums) {
            // Will be covered with different element
            if (set.contains(num - 1)) {
                continue;
            }

            int length = 1;
            while (set.contains(num + length)) {
                length++;
            }
            maxSequence = Math.max(maxSequence, length);
        }

        return maxSequence;
    }

    public static void main(String[] args) {
    }
}
