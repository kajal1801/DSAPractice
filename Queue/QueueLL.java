public class QueueLL{
    int count;
    final int MAX = 30;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    Node head = null;
    QueueLL(){
        count = 0;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(count == MAX-1){
            return true;
        }
        return false;
    }

    public void push(int d){
        Node newnode = new Node(d);
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(head == null){
            head = newnode;
            count++;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        System.out.println(newnode.data + " has been pushed into the Queue");
        count++;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(head.data + " has been popped");
        head = head.next;
    }

    public void printQueue(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        QueueLL obj = new QueueLL();
        obj.push(10);
        obj.push(56);
        obj.pop();
        obj.push(90);
        obj.push(6);
        obj.push(23);
        obj.pop();
        obj.printQueue();
    }
}