import java.util.* ;

public class MinimumPathSumGrid { 
    public static int f(int i, int j, int[][] grid, int[][] dp){
        if(i == 0 && j == 0){
            return grid[i][j];
        }
        if(i < 0 || j < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = f(i-1, j, grid, dp);
        int left =  f(i, j-1, grid, dp);
        
        return dp[i][j] = grid[i][j] + Math.min(up, left);
    }
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return f(grid.length - 1, grid[0].length - 1, grid, dp);
    }
}

