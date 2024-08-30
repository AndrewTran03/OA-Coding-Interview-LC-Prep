package NeetCode150_ProblemSolving;

import java.util.*;

public class ContainsDuplicate0217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            } else {
                hs.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
    }
}