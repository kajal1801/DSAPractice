public class MoveNegative {
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] ans = new int[arr.length];
        int i = 0, l=0,r = arr.length -1;
        while(l <= r && i < arr.length){
            if(arr[i] >=0){
                ans[l] = arr[i];
                l++;
            }
            if(arr[n-i-1] < 0){
                ans[r] = arr[n-i-1];
                r--;
            }
            i++;
        }
        for(i = 0;i<ans.length;i++){
            arr[i] = ans[i];
        }
    }
}
