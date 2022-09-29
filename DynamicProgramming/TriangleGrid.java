import java.util.* ;

public class TriangleGrid {
    public static int f(int i, int j, int[][] triangle, int[][] dp){
        if(i == triangle.length - 1){
            return triangle[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down = f(i+1, j, triangle, dp);
        int diagonal = f(i+1, j+1, triangle, dp);
        
        return dp[i][j] = triangle[i][j] + Math.min(down, diagonal);
    }
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int[][] dp = new int[triangle.length][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return f(0, 0, triangle, dp);
    }
}

