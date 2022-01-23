import java.util.Scanner;

public class ReverseLink {
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

    public void reversinglinks(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        Node current = head;
        Node prevnode = null;
        Node nextnode = null;

        while(current != null){
            nextnode = current.next;
            current.next = prevnode;
            prevnode = current;
            current = nextnode;
        }

        head = prevnode;
    }

    /* Main Method */
    public static void main(String args[]) {
        ReverseLink ob = new ReverseLink();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice != 0){
            System.out.println("Enter 1 to insert elements in the list\nEnter 2 to print the original List\nEnter 3 to print the reversed List\nEnter 0 to quit: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter the data to be inserted: ");
                    int d = sc.nextInt();
                    ob.insert(d);
                    break;
                case 2:
                    System.out.println("List before reversing: ");
                    ob.printlist();
                    System.out.println("NULL");
                    break;
                case 3:
                    ob.reversinglinks();
                    ob.printlist();
                    System.out.println("NULL");
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
