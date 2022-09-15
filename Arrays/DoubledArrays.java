import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DoubledArrays {
    public int[] doubledaraaytosingle(int[] changed){
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        Arrays.sort(changed);
        
        for(int num : changed){
            if(!q.isEmpty() && num == q.peek()){
                q.poll();
            }else{
                q.offer(num * 2);
                result.add(num);
            }
        }
        
        return !q.isEmpty() ? new int[] {} :  result.stream().mapToInt(i -> i).toArray();
    }
}
