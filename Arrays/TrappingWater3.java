public class TrappingWater3 {
    public static int waterTrap(int[] height){
        int n = height.length;
        int l = 0, r = n-1;
        int ans = 0;
        int lmax = 0, rmax = 0;
        while(l<=r){
            if(height[l] <= height[r]){
                if(lmax <= height[l]){
                    lmax = height[l];
                }
                else{
                    ans += lmax - height[l];
                }
                l++;
            }
            else{
                if(rmax < height[r]){
                    rmax = height[r];
                }
                else{
                    ans += rmax - height[r];
                }
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = waterTrap(height);
        System.out.println(ans);
    }
}
