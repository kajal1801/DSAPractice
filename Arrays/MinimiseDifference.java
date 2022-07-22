import java.util.Arrays;

public class MinimiseDifference {  
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;
        int ans = arr[n-1] - arr[0];
        for(int i = 0;i < n-1;i++){
            if(arr[i+1] < k){
                continue;
            }
            maxValue = Math.max(arr[i] + k,arr[n-1] - k);
            minValue = Math.min(arr[i+1]-k, arr[0]+k);
            ans = Math.min(ans, maxValue - minValue);
        }
        return ans;
    }  
}
