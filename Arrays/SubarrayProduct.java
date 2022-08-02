public class SubarrayProduct {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maximum = arr[0], ans = arr[0], minimum = arr[0];
        for(int i = 1;i < n;i++){
            if(arr[i] < 0){
                long temp = maximum;
                maximum = minimum;
                minimum = temp;
            }
            maximum = Math.max(arr[i], arr[i]*maximum);
            minimum = Math.min(arr[i], arr[i]*minimum);
            ans = Math.max(ans, maximum);
        }
        return ans;
    }
} 
