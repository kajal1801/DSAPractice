public class StrictlyPalindromic {
    public boolean palin(String s){
        int left = 0, right = s.length()-1;
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public int check(int n, int b){
        if(n == 0){
            return 0;
        }
        return n%b+10*check(n/b,b);
    }
    public boolean isStrictlyPalindromic(int n) {
        boolean num;
        num = palin(Integer.toString(n));
        for(int b = 2;b <= n-2;b++){
            num = num && palin(Integer.toString(check(n, b)));
        }
        
        return num; 
    }
}