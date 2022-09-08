class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class AddTwoNumbers{
    public ListNode addNum(ListNode l1, ListNode l2, ListNode temp){
        ListNode ans = temp;
        int carry = 0, sum = 0;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        while(l1 != null){
            sum =l1.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null){
            sum =l2.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            l2 = l2.next;
            temp = temp.next;
        }
        while(carry != 0){
            temp.next = new ListNode(carry%10);
            carry/=10;
            temp = temp.next;
        }
        return ans.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNum(l1, l2, new ListNode(0));
    }
}