import java.util.ArrayList;
import java.util.List;

class HouseRobbers{
    public int rob(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        
        list.add(nums[0]);
        list.add(Math.max(nums[0],nums[1]));
        
        for(int i = 2; i < nums.length;i++){
            list.add(Math.max(list.get(i-2)+nums[i],list.get(i-1)));
        }
        return list.get(list.size()-1);
    }
}