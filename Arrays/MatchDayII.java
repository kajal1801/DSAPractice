import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MatchDayII{
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        Deque<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();

        for(int i=0;i<n;++i){
            if(q.size()>0 && i-q.getFirst()>=k){
                q.removeFirst();
            }
            while(q.size()>0 && arr[q.getLast()] <= arr[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                ans.add(arr[q.getFirst()]);
            }
        }

        return ans;
    }
}