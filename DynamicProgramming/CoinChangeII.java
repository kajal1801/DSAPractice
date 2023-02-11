import java.util.Arrays;

public class CoinChangeII {
    public int helper(int index, int coins[], int amount, int[][] dp){
        if(index == 0){
            if(amount == 0 || amount % coins[index] == 0){
                return 1;
            }
            return 0;
        }

        if(dp[index][amount] != -1){
            return dp[index][amount];
        }

        int notpick = helper(index - 1, coins, amount, dp);
        int pick = 0;
        if(amount >= coins[index]){
            pick = helper(index, coins, amount - coins[index], dp);
        }

        return dp[index][amount] = pick + notpick;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(coins.length - 1, coins, amount, dp);
    }
}
