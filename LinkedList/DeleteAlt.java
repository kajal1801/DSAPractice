import java.util.Scanner;

public class DeleteAlt {
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

    /* Printing the List */
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

    public void delete_alt(){
        Node current = head;
        Node temp = current.next;
        while(current!=null && temp!=null){
            current.next = temp.next;
            temp = null;
            current = current.next;
            if(current != null){
                temp = current.next;
            }
            count--;
        }
    }
    public static void main(String args[]) {
        DeleteAlt ob = new DeleteAlt();
        Scanner sc = new Scanner(System.in);
        int choice = 1,d;
        while(choice != 0){
            System.out.println("Enter 1 to insert elements in the list\nEnter 2 to print the original List\nEnter 3 to delete alternate elements\nEnter 0 to quit: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    ob.insert(d);
                    break;
                case 2:
                    ob.printlist();
                    System.out.println("NULL");
                    break;
                case 3:
                    ob.delete_alt();
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
