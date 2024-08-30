package NeetCode150_ProblemSolving;

import java.util.*;

public class MaxAreaOfIslands0695 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        Set<String> visitedSet = new HashSet<>();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                maxArea = Math.max(maxArea, dfsHelper(grid, row, col, visitedSet));
            }
        }

        return maxArea;
    }

    private int dfsHelper(int[][] grid, int row, int col, Set<String> visited) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0
                || visited.contains(row + "," + col)) {
            return 0;
        }

        visited.add(row + "," + col);
        return 1 + dfsHelper(grid, row - 1, col, visited) + dfsHelper(grid, row + 1, col, visited)
                + dfsHelper(grid, row, col - 1, visited) + dfsHelper(grid, row, col + 1, visited);
    }

    public static void main(String[] args) {
    }
}
