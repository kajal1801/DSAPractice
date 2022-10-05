import java.util.* ;

public class ChocolatePickUp {
    static int f(int i, int j1, int j2, int[][] grid, int r, int c, int[][][] dp){
        if(j1 < 0 || j1 >= c || j2 < 0 || j2 >= c){
            return (int)Math.pow(-10, 9);
        }
        if(i == r-1){
            if(j1 == j2){
                return grid[i][j1];
            }
            return (grid[i][j1] + grid[i][j2]);
        }
        if(dp[i][j1][j2] != -1){
            return dp[i][j1][j2];
        }
        
        int maxi = Integer.MIN_VALUE;
        for(int dj1 = -1;dj1 <=1; dj1++){
            
            for(int dj2 = -1; dj2 <= 1; dj2++){
                int ans;
                if(j1 == j2){
                    ans = grid[i][j1] + f(i+1, j1 + dj1, j2+dj2, grid, r, c, dp);
                }
                else{
                    ans = grid[i][j1] + grid[i][j2] + f(i+1, j1 + dj1, j2+dj2, grid, r, c, dp);
                }
                 maxi = Math.max(maxi, ans);
            }
           
        }
        
        return dp[i][j1][j2] = maxi;
    }
	public static int maximumChocolates(int r, int c, int[][] grid) {
		// Write your code here.
        int[][][] dp = new int[r][c][c];
        for(int[][] row : dp){
            for(int[] col : row){
                Arrays.fill(col, -1);
            }
        }
        return f(0, 0, c - 1, grid, r, c, dp);
	}
}