package NeetCode150_ProblemSolving;

import java.util.*;

public class ValidAnagram0242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!hm.containsKey(c)) {
                hm.putIfAbsent(c, 0);
            }
            hm.put(c, hm.get(c) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!hm.containsKey(c)) {
                return false;
            } else {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) == 0) {
                    hm.remove(c);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}