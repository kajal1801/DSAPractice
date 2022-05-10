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

public class MergeSortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        merge(list1,list2,head);
        return head;
    }
    public void merge(ListNode list1, ListNode list2, ListNode curr){
        if(list1 == null && list2 == null){
            return;
        }
        else if(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(curr == null){
                    curr = list1;
                }
                else{
                    curr.next = list1;
                }
                list1 = list1.next;
            }
            else{
                if(curr == null){
                    curr = list2;
                }
                else{
                    curr.next = list2;
                }
                list2 = list2.next;
            }
        }
        else if(list1 != null){
            curr.next = list1;
            return;
        }
        else if(list2 !=null){
            curr.next = list2;
            return;
        }
        merge(list1,list2,curr.next);
    }
}
