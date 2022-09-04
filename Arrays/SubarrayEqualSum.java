import java.util.Arrays;

public class SubarrayEqualSum {
    public boolean findSubarrays(int[] nums) {
        int sum[] = new int[nums.length - 1];
        for(int i = 1;i < nums.length;i++){
            sum[i-1] = nums[i-1] + nums[i];
        }
        Arrays.sort(sum);
        for(int i = 1;i<sum.length;i++){
            if(sum[i] == sum[i-1]){
                return true;
            }
        }
        return false;
    }
}
