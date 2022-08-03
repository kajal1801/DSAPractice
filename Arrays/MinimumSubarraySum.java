public class MinimumSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = 0, res = Integer.MAX_VALUE;
        while(end < nums.length){
            sum += nums[end];
            while(sum >= target){
                sum -= nums[start];
                res = Math.min(res, end-start+1);
                start++;
            }
            end++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

}
