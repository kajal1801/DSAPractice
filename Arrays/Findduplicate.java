public class Findduplicate {
    public int findDuplicate(int[] nums) {
        int[] hashMap = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            hashMap[nums[i]]++;
        }
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(hashMap[i] > 1){
                k = i;
                break;
            }
        }
        return k;
    }
}
