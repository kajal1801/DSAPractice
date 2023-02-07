import java.util.Arrays;

public class CoinChange {
    public int helper(int ind, int amount, int coins[], int dp[][]){
        if(ind == 0){
            if(amount % coins[ind] == 0){
                return (int)(amount/coins[ind]);
            }
            return 1000000009;
        }
        if(dp[ind][amount] != -1){
            return dp[ind][amount];
        }

        int nottake = helper(ind-1, amount, coins, dp);
        int take = Integer.MAX_VALUE;
        if(amount >= coins[ind]){
            take = 1 + helper(ind, amount - coins[ind], coins, dp);
        }

        return dp[ind][amount] = Math.min(take, nottake);
    }

    public int coinChanging(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        int a = helper(coins.length - 1, amount, coins, dp);
        if(a == 1000000009){
            return -1;
        }
        return a;
    }
}
