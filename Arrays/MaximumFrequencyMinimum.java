import java.util.Arrays;

public class MaximumFrequencyMinimum {
    public static int mostFrequentEven(int[] nums) {
        int hashMap[] = new int[100001];
        Arrays.fill(hashMap,0);
        for(int i = 1;i < nums.length;i++){
            hashMap[nums[i]]++;
        }
        int ans = Integer.MAX_VALUE, value = 0;
        for(int i = 1;i < hashMap.length;i++){
            if(hashMap[i] > value){
                if(hashMap[i] != 0 && i % 2  == 0)
                {
                    ans = i;
                    value = hashMap[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 4, 4};
        int ans = mostFrequentEven(nums);
        System.out.println(ans);
    }
}
