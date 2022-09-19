import java.util.ArrayList;
import java.util.List;

public class SmallOnLeft {
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        List<Integer> list = new ArrayList<Integer>();
        int lmin = a[0];
        list.add(-1);
        for(int i = 1;i < n;i++){
            if(lmin < a[i]){
                list.add(lmin);
                lmin = a[i];
            }
            else{
                int j = i-1;
                while(j>=0 && !(lmin < a[i])){
                    lmin = a[j--];
                }
                if(lmin < a[i]){
                    list.add(lmin);
                }
                else{
                    list.add(-1);
                }
                lmin = a[i];
            }
        }
        return list;
    }
}
