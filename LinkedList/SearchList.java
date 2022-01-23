import java.util.Scanner;

public class SearchList {
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

    public void search(int ele){
        if(head == null){
            System.out.println("The list is empty");
        }
        
        Node current = head;
        int f = 0;

        while(current != null){
            if(current.data == ele){
                System.out.println("Yes the element is present in the list");
                f = 1;
                break;
            }
            current = current.next;
        }

        if(f == 0){
            System.out.println("The element is not present in the list");
        }
    }

    /* Main Method */
    public static void main(String args[]) {
        SearchList ob = new SearchList();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice != 0){
            System.out.println("Enter 1 to insert elements in the list\nEnter 2 to print the original List\nEnter 3 to search an element in the list\nEnter 0 to quit: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter the data to be inserted: ");
                    int d = sc.nextInt();
                    ob.insert(d);
                    break;
                case 2:
                    ob.printlist();
                    System.out.println("NULL");
                    break;
                case 3:
                    System.out.println("Enter the element to be searched: ");
                    int ele = sc.nextInt();
                    ob.search(ele);
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
