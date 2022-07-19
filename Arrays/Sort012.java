public class Sort012 {
    public void sortColors(int[] nums) {
        int i = 0, l = 0, r = nums.length - 1, temp = 0;
        while(l < r && i <= r){
            
            if(nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }
            
            if(nums[i] == 2){
                temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
                i--;
            }
            
            i++;
        }
    }
}
