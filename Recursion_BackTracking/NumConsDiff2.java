import java.util.ArrayList;

public class NumConsDiff2 {
    public void diff(int num, int i, int n, int k, ArrayList<Integer> list){
        if(n==0){
            list.add(num);
            return;
        }
        
        if(i+k < 10){
            diff(num*10 + (i+k), i+k, n-1, k, list);
        }
        if(k !=0 && i-k >= 0){
            diff(num*10 + (i-k), i-k, n-1, k, list);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int num = 1; num < 10;num++){
            diff(num, num, n-1, k, list);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
