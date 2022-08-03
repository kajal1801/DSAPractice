public class TrappingWaterII {
    public static long trappingWater(int arr[], int n) { 
        // Your code here
        long res = 0;
        int leftMax = arr[0], rightMax = arr[n-1];
        int left = 0, right = n-1;
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, arr[left]);
                res += (leftMax - arr[left]);
            }
            else{
                right--;
                rightMax = Math.max(rightMax, arr[right]);
                res += (rightMax - arr[right]);
            }
        }
        return res;
    } 
}
