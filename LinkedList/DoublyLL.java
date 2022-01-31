public class DoublyLL{

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public void create(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            head.prev = null;
            tail.next = null;
            size++;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = null;
            size++;
        }
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.print("NULL <--> ");
        while(current != null){
            System.out.print(current.data+ " <--> ");
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println("\nThe size of the list is: "+size);
    }

    public static void main(String[] args){
        DoublyLL ob = new DoublyLL();
        ob.create(23);
        ob.create(12);
        ob.create(98);
        ob.create(74);
        ob.create(109);

        ob.printlist();
    }
}