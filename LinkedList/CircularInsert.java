import java.util.Scanner;

public class CircularInsert extends CircularLL {
    
    public void insert_beg(int new_data){
        Node newnode = new Node(new_data);
        if(head == null){
            head = newnode;
            tail = newnode;
            size++;
        }
        newnode.next = head;
        head = newnode;
        tail.next = head;
    }

    public void insert_end(int new_data){
        Node newnode = new Node(new_data);
        if(head == null){
            head = newnode;
            tail = newnode;
            size++;
        }
        tail.next = newnode;
        tail = newnode;
        tail.next = head;
        size++;
    }

    public void insert_any_pos(int new_data,int n){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node newnode = new Node(new_data);
        Node current = head;
        while(--n > 1){
            current = current.next;
        }
        newnode.next = current.next;
        current.next = newnode;
        size++;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        CircularInsert obj = new CircularInsert();
        obj.create(12);
        obj.create(2);
        obj.create(-9);
        obj.create(45);
        obj.create(87);
        obj.create(34);

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
