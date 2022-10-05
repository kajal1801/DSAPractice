import java.util.* ;

public class MaximumFallingPathSum {
    
    static int f(int i, int j, int m, int[][] matrix, int[][] dp){
        if(j < 0 || j >= m){
            return (int)Math.pow(-10, 9);
        }
        if(i == 0){
            return matrix[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int s = (int)(matrix[i][j] + f(i-1, j, m, matrix, dp));
        int l = (int)(matrix[i][j] + f(i-1, j-1, m, matrix, dp));
        int r = (int)(matrix[i][j] + f(i-1, j+1, m, matrix, dp));
        
        return dp[i][j] = Math.max(s, Math.max(l,r));
    }
	public static int getMaxPathSum(int[][] matrix) {
		// Write your code here
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        int maxi = Integer.MIN_VALUE;
        for(int j=0; j<m;j++){
            int ans = f(n-1, j, m, matrix, dp);
            maxi = Math.max(maxi,ans);
        }
        return maxi;
	}
}
