import java.util.ArrayList;

public class ArraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i = 0;i < n;i++){
            list.add(a1[i]);
        }
        int k = 0;
        for(int i = 0; i < m;i++){
            if(!list.contains(a2[i])){
                k = 1;
                break;
            }
        }
        if(k == 0){
            return "Yes";
        }
        return "No";
    }
}