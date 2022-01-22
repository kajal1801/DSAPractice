import java.util.Scanner;

public class SinglyDelete {
    int count = 0;
        /* Inner Class */
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    Node head = null;

    /* Printing List */
    public void printlist(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    /* Inserting elements */
    public void insert(int new_data){
        Node newnode = new Node(new_data);

        if(head == null){
            head = newnode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
        count++;
        newnode = null;
    }

    /* Deleting a node from the beginning of the list */
    public void delete_beg(){
        if(head == null){
            System.out.println("Operation not applicable");
            return;
        }
        Node current = head;
        head = head.next;
        current.next = null;
        count--;
        System.out.println("Removed Element: "+ current.data);
    }

    /* Deleting the node from the end of the list */
    public void delete_end(){
        if(head == null){
            System.out.println("Operation not applicable");
            return;
        }
        Node current = head;
        Node last = head.next;
        while(last.next != null){
            current = current.next;
            last = last.next;
        }
        count--;

        current.next = null;
        System.out.println("Removed Element: "+last.data);
    }

    /* Deleting a node from a given position */
    public void delete_anypos(int pos){
        if(head == null || pos>count){
            System.out.println("Operation not applicable");
            return;
        }
        Node current = head;
        Node temp = head.next;
        while(pos>2){
            current = current.next;
            temp = temp.next;
            pos--;
        }
        current.next = temp.next;
        temp.next = null;
        count--;
        System.out.println("Removed Element: "+temp.data);
    }

    public static void main(String args[]){
        SinglyDelete slist = new SinglyDelete();
        Scanner sc = new Scanner(System.in);
        int choice = 1,d,pos;

        while(choice != 0){
            System.out.println("Enter 1 to print the Linked List\nEnter 2 to insert an element in the beginning\nEnter 3 to delete the node from the beginning\nEnter 4 to delete the node from the end\nEnter 5 to delete the node from any position\nEnter 6 to delete the node from the middle\nEnter 0 to quit\nEnter your choice: \n");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    slist.printlist();
                    System.out.println("NULL");
                    break;
                case 2:
                    System.out.println("Enter the element to be inserted: ");
                    d = sc.nextInt();
                    slist.insert(d);
                    break;
                case 3:
                    slist.delete_beg();
                    break;
                case 4:
                    slist.delete_end();
                    break;
                case 5:
                    System.out.println("Enter the position of the element you want to delete: ");
                    pos = sc.nextInt();
                    slist.delete_anypos(pos);
                    break;
                case 6:
                    pos = slist.count/2 + 1;
                    slist.delete_anypos(pos);
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
