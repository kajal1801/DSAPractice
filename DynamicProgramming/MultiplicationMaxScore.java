public class MultiplicationMaxScore{
    int n, m;
    Integer[][] dp;
    public int maximumScore(int[] nums, int[] multipliers) {
        n = nums.length;
        m = multipliers.length;        
        
        dp = new Integer[1001][1001];
        return helper(0, 0, nums, multipliers);
    }
    
    private int helper(int i, int j, int[] nums, int[] mul) {
        if( i== m ){
            return 0;
        }
        if( dp[i][j] != null ){
            return dp[i][j]; 
        } 
        var left= mul[i]*nums[j] + helper(i+1, j+1, nums, mul);        
        var right = mul[i]*nums[n-1 -(i-j)] + helper(i+1, j, nums, mul);
        
        dp[i][j] = Math.max(left, right);
        return dp[i][j];
    }
}