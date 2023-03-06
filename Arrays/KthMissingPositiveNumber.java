public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int ans = -1;
        int p = 0;
        for(int i = 1;i <= 1000 && p < arr.length;i++){
            if(arr[p++] != i){
                k--;
                p--;
                ans = i;
            }
            if(k == 0){
                break;
            }
        }
        if(ans == -1 || k != 0){
            ans = arr[arr.length - 1] + k;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        int k = 9;
        System.out.println(findKthPositive(arr, k));
    }
}
