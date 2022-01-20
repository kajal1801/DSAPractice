import java.util.Scanner;

public class SinglyLinked {
    Node head = null;

    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    int count = 0;

    public void printlist(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    public void insert_at_beg(int new_data){

        Node newnode = new Node(new_data);

        newnode.next = head;

        head = newnode;
        count++;

    }

    public void insert_at_end(int new_data){

        Node newnode = new Node(new_data);

        if(head == null){
            head = newnode;
            count++;
            return;
        }

        Node current = head;

        newnode.next = null;

        while(current.next != null){
            current = current.next;
        }

        current.next = newnode;
        count++;

    }

    public void insertafter(int element, int new_data){
        Node newnode = new Node(new_data);

        if(head == null){
            head = newnode;
            count++;
            return;
        }

        Node current = head;
        newnode.next = null;
        while(current.data != element){
            current = current.next;
        }
        Node temp;
        temp = current.next;
        current.next = newnode;
        newnode.next = temp;
        count++;
    }

    public void insert_at_pos(int pos, int new_data) {
        Node newnode = new Node(new_data);
        
        if(head == null){
            head = newnode;
            count++;
            return;
        }

        Node current = head;
        newnode.next = null;
        if(pos>count){
            System.out.println("Position is greater than the length of the list");
            return;
        }

        while(pos>2){
            current = current.next;
            pos--;
        }
        Node temp = current.next;
        current.next = newnode;
        newnode.next = temp;
        count++;
    }

    public void insert_at_mid(int new_data) {
        int pos = count/2 + 1;
        
        Node newnode = new Node(new_data);
        
        if(head == null){
            head = newnode;
            count++;
            return;
        }

        Node current = head;
        newnode.next = null;
        if(pos>count){
            System.out.println("Position is greater than the length of the list");
            return;
        }

        while(pos>2){
            current = current.next;
            pos--;
        }
        Node temp = current.next;
        current.next = newnode;
        newnode.next = temp;
        count++;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SinglyLinked slist = new SinglyLinked();

        int choice = 1,d,pos;

        while(choice != 0){
            System.out.println("Enter 1 to print the Linked List\nEnter 2 to insert an element in the beginning\nEnter 3 to insert an element at the end\nEnter 4 to insert an element after a given element\nEnter 5 to insert the element at a given pos\nEnter 6 to insert the element at the middle of the linked list\nEnter 0 to quit\nEnter your choice: \n");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    slist.printlist();
                    System.out.println("NULL");
                    break;
                case 2:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    slist.insert_at_beg(d);
                    break;
                case 3:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    slist.insert_at_end(d);
                    break;
                case 4:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    System.out.println("Enter the element after which you want to insert the data: ");
                    int ele = sc.nextInt();
                    slist.insertafter(ele,d);
                    break;
                case 5:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    System.out.println("Enter the position at which you want to insert the data: ");
                    pos = sc.nextInt();
                    slist.insert_at_pos(pos, d);
                    break;
                case 6:
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    slist.insert_at_mid(d);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        
        sc.close();

    }

}
