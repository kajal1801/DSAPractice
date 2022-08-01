import java.util.LinkedList;
import java.util.Queue;

public class AltPosNeg {
    void rearrange(int arr[], int n) {
        // code here
        Queue<Integer> pos = new LinkedList<Integer>();
        Queue<Integer> neg = new LinkedList<Integer>();
        for(int i = 0;i < n;i++){
            if(arr[i] >= 0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int i = 0;
        while(i<n){
            if(!pos.isEmpty()){
                arr[i++] = pos.poll();
            }
            if(!neg.isEmpty()){
                arr[i++] = neg.poll();
            }
        }
    }
}
