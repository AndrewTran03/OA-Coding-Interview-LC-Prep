package NeetCode150_ProblemSolving;

public class NumberOfIslands0200 {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    dfsHelper(grid, row, col);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    private void dfsHelper(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';
        dfsHelper(grid, row - 1, col);
        dfsHelper(grid, row + 1, col);
        dfsHelper(grid, row, col - 1);
        dfsHelper(grid, row, col + 1);
        return;
    }

    public static void main(String[] args) {
    }
}
