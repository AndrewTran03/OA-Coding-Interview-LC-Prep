package NeetCode150_ProblemSolving;

public class SearchA2DMatrixI0074 {
    public boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        final int rowLength = matrix.length;
        final int colLength = matrix[0].length;   
        int rowLeft = 0, rowRight = rowLength - 1;

        while (rowLeft <= rowRight) {
            int rowMid = (rowLeft + rowRight) / 2;
            if (matrix[rowMid][0] <= target && matrix[rowMid][colLength - 1] >= target) {
                return binarySearch(matrix[rowMid], target);
            } else if (matrix[rowMid][0] > target) {
                rowRight = rowMid - 1;
            } else { // matrix[rowMid][colLength - 1] < target
                rowLeft = rowMid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
