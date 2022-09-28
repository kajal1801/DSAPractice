class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class DeleteNthNodefromEnd {
    public int counter(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void deleteNode(ListNode head, int n){
        
        ListNode prev = null;
        ListNode temp = head;
        while(n-- > 0){
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = temp.next;
        temp = null;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = counter(head);
        if(count == 1){
            return null;
        }
        if(n == count){
            return head.next;
        }
        n = count - n;
        deleteNode(head, n);
        return head;
    }
}
