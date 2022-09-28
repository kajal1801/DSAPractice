import java.util.Arrays;

public class FittingTheArray {
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean flag = true;
        for(int i = 0;i < n;i++){
            if(arr[i] > brr[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
