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
