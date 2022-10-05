import java.util.*;
public class PartitionEqual {
    public static boolean partition(int i, int target, int[] arr, int[][] dp){
        if(target == 0){
            return true;
        }
        if(i == 0){
            return arr[0] == target;
        }
        if(dp[i][target] != -1){
            return (dp[i][target] == 0) ? false : true;
        }
        
        boolean taken = false, notTaken;
        notTaken = partition(i-1, target, arr, dp);
        if(arr[i] <= target){
            taken = partition(i-1, target - arr[i], arr, dp);
            dp[i][target] = (notTaken || taken) ? 1 : 0;
        }
        
        return notTaken || taken;
    }
	public static boolean canPartition(int[] arr, int n) {
		// Write your code here.
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        int target = sum/2;
        int[][] dp = new int[n][target + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return partition(n-1, target, arr, dp);
	}
}