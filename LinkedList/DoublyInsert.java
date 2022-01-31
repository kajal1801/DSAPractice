import java.util.Scanner;

public class DoublyInsert extends DoublyLL{

    // class Node{
    //     int data;
    //     Node next;
    //     Node prev;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //         this.prev = null;
    //     }
    // }

    public void insert_beg(int new_data){
        Node newnode = new Node(new_data);
        if(head == null){
            head = tail = newnode;
            head.prev = null;
            tail.next = null;
            size++;
        }
        else{
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
            head.prev = null;
            size++;
        }
    }

    public void insert_end(int new_data){
        Node newnode = new Node(new_data);
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

    public void insert_any_pos(int new_data, int n){
        Node newnode = new Node(new_data);
        if(head == null){
            head = tail = newnode;
            head.prev = null;
            tail.next = null;
            size++;
            return;
        }
        if(n>size){
            System.out.println("Given position is out of Index");
            return;
        }
        Node current = head;
        while(n-- > 2 && current != null){
            current = current.next;
        }
        newnode.next = current.next;
        newnode.prev = current;
        current.next.prev = newnode;
        current.next = newnode;
        size++;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyInsert obj = new DoublyInsert();
        obj.create(23);
        obj.create(12);
        obj.create(98);
        obj.create(74);
        obj.create(109);

        int choice = 1;

        while(choice != 0){
            System.out.println("Enter 1 to insert at the beginning\nEnter 2 to insert at the end\nEnter 3 to insert at any position\nEnter 4 to print the list\nEnter 0 to end:");
            choice = sc.nextInt();
            int d;
            switch(choice){
                case 1:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    obj.insert_beg(d);
                    break;
                case 2:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    obj.insert_end(d);
                    break;
                case 3:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    System.out.println("Enter the position where you want to insert the element: ");
                    int n = sc.nextInt();
                    obj.insert_any_pos(d, n);
                    break;
                case 4:
                    System.out.println("The List after insertion is: ");
                    obj.printlist();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}
