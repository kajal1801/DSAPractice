import java.util.HashMap;

public class Tribonacci {
    public int tri(int n, HashMap<Integer, Integer> memo){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int currentKey = n;
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        
        memo.put(currentKey, tri(n-1, memo) + tri(n-2, memo) + tri(n-3, memo));
        return memo.get(currentKey);
    }
    public int tribonacci(int n) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        return tri(n, memo);
    }
}
