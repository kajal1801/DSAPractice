public class BallColouring{
    static long noOfWays(long n){
        // code here
        if(n == 1){
            return 2;
        }
        long ans = 0;
        ans = (n*(n-1)) + 2;
        return ans;
    }
}