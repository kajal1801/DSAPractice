import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long res = Long.MAX_VALUE;
        for(int i = m-1;i<n;i++){
            res = Math.min(res, (a.get(i) - a.get(i-m + 1)));
        }
        return res;
    }
}