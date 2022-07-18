import java.util.*;
class PQueue{
    public static void main(String args[]){
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        // Min Heap
        pq1.add(5);
        pq1.add(15);
        pq1.add(10);
        System.out.println(pq1.size());
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.poll();
        }

        // Max Heap
        pq2.add(5);
        pq2.add(15);
        pq2.add(10);
        System.out.println(pq2.size());
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek());
            pq2.poll();
        }
    }
}