package NeetCode150_ProblemSolving;

public class BestTimeToBuyAndSell0121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, leftPos = 0, rightPos = 1;
        final int length = prices.length;
        if (length <= 1) {
            return maxProfit;
        }
        
        while (rightPos < length) {
            int difference = prices[rightPos] - prices[leftPos];
            if (difference > 0) {
                maxProfit = Math.max(difference, maxProfit);
            } else {
                leftPos = rightPos;
            }
            rightPos++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
    }
}