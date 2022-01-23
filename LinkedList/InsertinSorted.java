import java.util.Scanner;

public class InsertinSorted{
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

    public void insert_in_sorted(int new_data){
        Node newnode = new Node(new_data);
        Node current = head;
        
        while(current!=null && current.next.data < new_data){
            current = current.next;
        }

        newnode.next = current.next;
        current.next = newnode;
    }

    /* Main Method */
    public static void main(String args[]) {
        InsertinSorted ob = new InsertinSorted();
        Scanner sc = new Scanner(System.in);
        int choice = 1,d;
        while(choice != 0){
            System.out.println("Enter 1 to insert elements in the list\nEnter 2 to print the original List\nEnter 3 to insert in the sorted list\nEnter 0 to quit: ");
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
                    System.out.println("Enter the data to be inserted: ");
                    d = sc.nextInt();
                    ob.insert_in_sorted(d);
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