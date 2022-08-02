public class TrappingWater {
    public static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for(int i = 1;i < n;i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        rmax[n-1] = arr[n-1];
        for(int i = n- 2;i >= 0; i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }
        long res = 0;
        for(int i = 0; i < n; i++){
            res = res + (Math.min(lmax[i],rmax[i]) - arr[i]);
        }
        return res;
    } 
}
