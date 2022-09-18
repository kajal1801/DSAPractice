// Memoization
import java.util.HashMap;

public class Fibonacci {
    public int fib(int n) {
        return calculate(n, new HashMap<Integer,Integer>());
    }
    
    public int calculate(int n, HashMap<Integer,Integer> hashMap){
        if(n==0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        
        int a = calculate(n-1, hashMap);
        int b = calculate(n-2, hashMap);
        
        hashMap.put(n, a+b);
        
        return a+b;
    }
}

/*
 * TC = O(n)
 * SC = O(n) + O(n) // Recursion + Array
*/

// Tabulation

/*
    dp[0] = 0, dp[1] = 0;
    for(i = 2; i <=n ; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }

    TC = O(n)
    SC = O(n)
*/

// Optimization

/*
    prev2 = 0, prev = 1;
    for(int i = 2; i <= n; i++){
        curr = prev + prev2;
        prev2 = prev;
        prev = curr;
    }
    return prev;

    TC = O(n)
    SC = O(1)
 */