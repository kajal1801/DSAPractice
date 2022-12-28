import java.util.PriorityQueue;

public class RemoveStonesMinimizeTotal {
    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
        for(int i : piles){
            pq.add(i);
        }

        while(!pq.isEmpty() && k-- > 0){
            int a = pq.poll();
            a = a - (int)Math.floor(a/2);
            pq.add(a);
        }
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}
