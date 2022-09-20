public class MaxLengthRepeatSubarray {
    public int findLength(int[] nums1, int[] nums2) {
        int ans = 0;
        int[] dp = new int[nums2.length+1];
        for(int i = 0; i < nums1.length;i++){
            for(int j = nums2.length-1;j>=0;j--){
                if(nums1[i] == nums2[j]){
                    dp[j+1] = 1 + dp[j];
                }
                else{
                    dp[j+1] = 0;
                }
                ans = Math.max(ans, dp[j+1]);
            }
        }
        return ans;
    }
}
