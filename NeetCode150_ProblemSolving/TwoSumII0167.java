package NeetCode150_ProblemSolving;

public class TwoSumII0167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum < target) {
                left++;
                continue;
            } else if (sum > target) {
                right--;
                continue;
            } else {
                break;
            }
        }

        return new int[] { left + 1, right + 1 };
    }

    public static void main(String[] args) {
    }
}