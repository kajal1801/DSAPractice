import java.util.* ;
import java.io.*; 
public class SubsetSum {
    public static boolean subsetSum(int k, int i, int[] arr, int[][] dp){
        if(k == 0){
            return true;
        }
        if(i == 0){
            return arr[0] == k;
        }
        if(dp[i][k] != -1){
            return (dp[i][k] == 0) ? false : true;
        }
        boolean taken = false;
        
        boolean notTaken = subsetSum(k, i-1, arr, dp);
        if(arr[i] <= k){
            taken = subsetSum(k-arr[i], i-1, arr, dp);
             dp[i][k] = (taken || notTaken) ? 1 : 0;
        }
        return taken || notTaken;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp = new int[n][k+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return subsetSum(k,n-1,arr, dp);
    }
}
