public class NextPermutation {
    
    public void reverse(int[] nums, int i, int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
    public void nextPermut(int[] nums) {
        int i1 = -1, i2 = -1;
        for(int i = nums.length -2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
                i1 = i;
                break;
            }
        }
        if(i1 >= 0){
            for(int i = nums.length -1; i>i1;i--){
                if(nums[i] > nums[i1]){
                    i2 = i;
                    break;
                }
            }
        }
        if(i1 >=0 && i2 >= 0){
            int temp = nums[i1];
            nums[i1] = nums[i2];
            nums[i2] = temp;
        }
        reverse(nums, i1+1, nums.length - 1);
    }
}