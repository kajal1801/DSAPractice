public class CircularLL {
    
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    public void create(int new_data){
        Node newnode = new Node(new_data);
        if(head == null){
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        tail.next = head;
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
            System.out.print(" --> " + current.data);
            current = current.next;
        }while(current != head);
        System.out.println(" --> ");
        System.out.println("The size of the list is : "+size);
    }

    public static void main(String[] args){
        CircularLL obj = new CircularLL();
        obj.create(2);
        obj.create(-9);
        obj.create(45);
        obj.create(87);
        obj.create(34);

        obj.printlist();
    }
}
