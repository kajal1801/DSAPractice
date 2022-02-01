public class CircularDLL {
    
    static class Node{
        int data;
        Node next,prev;

        Node(int d){
            this.data = d;
            this.next = null;
            this.prev =  null;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    public void create(int new_data){
        Node newnode = new Node(new_data);
        if(head == null){
            head = tail = newnode;
            head.prev = tail;
            tail.next = head;
            size++;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        tail.next = head;
        head.prev = tail;
        size++;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.println();
        do{
            System.out.print(" <--> " + current.data);
            current = current.next;
        }while(current != head);
        System.out.println(" <--> ");
        System.out.println("The size of the list is : "+size);
    }

    public static void main(String[] args){
        CircularDLL obj = new CircularDLL();
        obj.create(2);
        obj.create(-9);
        obj.create(45);
        obj.create(87);
        obj.create(34);

        obj.printlist();
    }
}
