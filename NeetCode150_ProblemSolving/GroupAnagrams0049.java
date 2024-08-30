package NeetCode150_ProblemSolving;

import java.util.*;

public class GroupAnagrams0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<HashMap<Character, Integer>, ArrayList<String>> hm = new HashMap<>();

        for (String str : strs) { // m strings
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char c : str.toCharArray()) { // n characters
                if (!temp.containsKey(c)) {
                    temp.putIfAbsent(c, 0);
                }
                temp.put(c, temp.get(c) + 1);
            }

            // boolean found = false;
            // for (Map.Entry<HashMap<Character, Integer>, ArrayList<String>> entry :
            // hm.entrySet()) {
            // if (entry.getKey().equals(temp)) {
            // found = true;
            // ArrayList<String> val = entry.getValue();
            // val.add(str);
            // hm.put(entry.getKey(), val);
            // break;
            // }
            // }
            // if (!found) {
            // hm.putIfAbsent(temp, new ArrayList<String>(Arrays.asList(str)));
            // }

            if (!hm.containsKey(temp)) {
                hm.put(temp, new ArrayList<String>());
            }
            hm.get(temp).add(str);
        }

        for (List<String> val : hm.values()) {
            result.add(val);
        }
        return result;
    }

    public List<List<String>> groupAnagramsBetter(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<String>());
            }
            hm.get(key).add(str);
        }

        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
    }
}
