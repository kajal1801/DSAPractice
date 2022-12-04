public class AbsoluteDifference {
    public static int minimumAverageDifference(int[] nums) {
        long prefixSum = 0;
        int n = nums.length;
        for(int i = 0;i < n;i++){
            prefixSum += nums[i];
        }
        
        long count = 1, sum = 0;
        int pos = 0;
        long min = Integer.MAX_VALUE;
        if(n == 1){
            return 0;
        }
        for(int i = 0;i < n - 1;i++){
            sum += nums[i];
            long first = sum/count;
            long last = (prefixSum - sum) / (n - count);
            long diff = Math.abs(first - last);
            if(diff < min){
                min = diff;
                pos = i;
            }
            count++;
        }
        
        if(min > (prefixSum / n)){
            pos = n-1;
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(nums));
    }
}
