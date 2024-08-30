package NeetCode150_ProblemSolving;

import java.util.*;

public class TopKFrequentElements0347 {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int num : nums) {
        //     if (!hm.containsKey(num)) {
        //         hm.putIfAbsent(num, 0);
        //     }
        //     hm.put(num, hm.get(num) + 1);
        // }
        // System.out.println(hm);

        // return hm.entrySet()
        //     .stream()
        //     .filter(entry -> entry.getValue() >= k)
        //     .map(entry -> entry.getKey())
        //     .mapToInt(key -> key)
        //     .toArray();
        
        Map<Integer, Integer> counts = new HashMap<>();
        ArrayList<Integer>[] frequencies = new ArrayList[nums.length + 1];

        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = new ArrayList<>();
        }

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            frequencies[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = frequencies.length - 1; i > 0 && index < k; i--) {
            for (int n : frequencies[i]) {
                result[index++] = n;
                if (index == k) {
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
