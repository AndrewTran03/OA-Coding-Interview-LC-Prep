package NeetCode150_ProblemSolving;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters0003 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, length = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            length = Math.max(length, right - left + 1);
        }
        return length;
    }

    public static void main(String[] args) {
    }
}
