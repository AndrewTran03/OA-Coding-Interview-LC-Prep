package NeetCode150_ProblemSolving;

public class LongestRepeatingCharacterReplacement0424 {
    public int characterReplacement(String s, int k) {
        // HashMap<Character, Integer> map = new HashMap<>(26);
        // for (int i = 0; i < 26; i++) {
        //     map.put((char)('A' + i), 0);
        // }
        // System.out.println(map.toString());
        int[] alphabetCounts = new int[26];
        int maxFreq = 0;

        int left = 0, res = 0;
        for (int right = 0; right < s.length(); right++) {
            alphabetCounts[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, alphabetCounts[s.charAt(right) - 'A']);

            if ((right - left + 1) - maxFreq > k) {
                alphabetCounts[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }

    public static void main(String[] args) {
    }
}
