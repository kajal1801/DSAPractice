import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num1 = -1, num2 = -1, c1 = 0, c2 = 0;
        for(int num : nums){
            if(num == num1){
                c1++;
            }
            else if(num == num2){
                c2++;
            }
            else if(c1 == 0){
                num1 = num;
                c1 = 1;
            }
            else if(c2 == 0){
                num2 = num;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == num1){
                c1++;
            }
            else if(nums[i] == num2){
                c2++;
            }
        }
        if(c1 > (nums.length/3)){
            list.add(num1);
        }
        if(c2 > (nums.length/3)){
            list.add(num2);
        }
        return list;
    }
}