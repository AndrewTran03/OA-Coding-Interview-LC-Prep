package NeetCode150_ProblemSolving;

import java.util.*;

public class DailyTemperatures0739 {
    public int[] dailyTemperatures(int[] temperatures) {
        final int MAX_LENGTH = temperatures.length;
        int[] result = new int[MAX_LENGTH];
        Stack<int[]> temps = new Stack<>();

        for (int i = 0; i < MAX_LENGTH; i++) {
            int currTemp = temperatures[i];

            while (!temps.isEmpty() && currTemp > temps.peek()[0]) {
                int[] poppedEntry = temps.pop();
                result[poppedEntry[1]] = i - poppedEntry[1];
            }
            temps.push(new int[]{ currTemp, i });
        }

        return result;
    }

    public static void main(String[] args) {
    }
}
