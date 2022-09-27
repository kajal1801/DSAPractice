import java.util.PriorityQueue;

public class MinimumCostRopes {
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(Long i:arr) pq.offer(i);
        long cost = 0;
        while(pq.size()>1){
            long p1 = pq.poll();
            long p2 = pq.poll();
            cost+=(p1+p2);
            pq.offer(p1+p2);
        }
        return cost;
    }
}
