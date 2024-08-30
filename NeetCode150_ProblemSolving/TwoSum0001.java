package NeetCode150_ProblemSolving;

import java.util.*;

public class TwoSum0001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(target - nums[i], i);
            } else {
                return new int[] { hm.get(nums[i]), i };
            }
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
    }
}