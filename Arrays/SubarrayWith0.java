import java.util.HashSet;

public class SubarrayWith0 {
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(0);
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += arr[i];
            if(hs.contains(sum)){
                return true;
            }
            else{
                hs.add(sum);
            }
        }
        return false;
    }

}
