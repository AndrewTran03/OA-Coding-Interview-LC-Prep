package NeetCode150_ProblemSolving;

import java.util.*;

public class KokoEatingBananas0875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0, right = Arrays.stream(piles).max().getAsInt();
        
        int result = right;
        while (left <= right) {
            int kRate = (left + right) / 2;

            int totalHrs = 0;
            for (int pile : piles) {
                totalHrs += Math.ceil((double) pile / kRate);
            }
            if (totalHrs <= h) {
                result = kRate;
                right = kRate - 1;
            } else {
                left = kRate + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}