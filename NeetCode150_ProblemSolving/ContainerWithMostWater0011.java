package NeetCode150_ProblemSolving;

public class ContainerWithMostWater0011 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int length = right - left;
            int maxHeight = Math.min(height[left], height[right]);
            int area = length * maxHeight;

            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
    }
}
