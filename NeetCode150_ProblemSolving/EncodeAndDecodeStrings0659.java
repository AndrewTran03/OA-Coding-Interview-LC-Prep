package NeetCode150_ProblemSolving;

import java.util.*;

public class EncodeAndDecodeStrings0659 {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int left = 0;
        while (left < str.length()) {
            int right = left;

            // Iterate across the buffer until we reach a '#' symbol
            while (str.charAt(right) != '#') {
                right++;
            }
            int lengthFollowingWord = Integer.parseInt(str.substring(left, right));
            int newLeft = right + 1 + lengthFollowingWord;
            res.add(str.substring(right + 1, newLeft));
            left = newLeft;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
