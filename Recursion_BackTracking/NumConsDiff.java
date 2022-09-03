import java.util.ArrayList;

public class NumConsDiff {
    public boolean diff(int i, int n, int k){
        String s = Integer.toString(i);
        for(int j = 1;j < n;j++){
            int a = s.charAt(j);
            int b = s.charAt(j-1);
            if(Math.abs(a - b) != k){
                return false;
            }
        }
        return true;
    }
    
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int p = (int)Math.pow(10,n-1);
        for(int i = p;i<(p*10);i++){
            boolean f = diff(i, n, k);
            if(f == true){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
