public class ContainerWithMostWater {  
    public int maxArea(int[] height) {
        int curr = 0, res = 0, l = 0, r = height.length-1;
        while(l < r){
            if(height[l] <= height[r]){
                curr = (r-l)*height[l];
                res = Math.max(curr,res);
                l++;
            }
            else{
                curr = (r-l)*height[r];
                res =  Math.max(curr, res);
                r--;
            }
        }
        return res;
    }
}
