import java.util.Arrays;

class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int ans = 0;
        int prev = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int start, end;
        for(int i = 0;i < nums.length;i++){
            start = i+1;
            end = nums.length - 1;
            while(start < end){
                sum = nums[i] + nums[start] + nums[end];
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    start++;
                }
                else{
                    end--;
                }
                
                if(prev > Math.abs(target- sum)){
                    ans = sum;
                }
                
                prev = Math.min(prev, Math.abs(target- sum));
            }
        }
        return ans;
    }
}