// Tabulation
import java.util.ArrayList;

public class ClimbingStairs2 {
    static int MOD = 1000000007;
    public static int tabulation(long nStairs){
        ArrayList<Integer> dp = new ArrayList<Integer>();
        dp.add(1);
        dp.add(1);
        for(int i = 2;i <= nStairs;i++){
            dp.add((dp.get(i-1) + dp.get(i-2))%MOD);
        }
        return dp.get(dp.size() - 1);
    }
	public static int countDistinctWayToClimbStair(long nStairs) {
		// Write your code here.
        int ans = tabulation(nStairs);
        return ans;
	}
}