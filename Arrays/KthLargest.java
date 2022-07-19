import java.util.PriorityQueue;
class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i < nums.length; i++){
            pq.add(nums[i]);
        }
        int pos = nums.length - k;
        while(pos > 0){
            pq.poll();
            pos--;
        }
        return (pq.poll());
    }
}