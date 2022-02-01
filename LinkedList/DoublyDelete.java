import java.util.Scanner;

public class DoublyDelete extends DoublyLL {
    
    public void delete_beg(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node dltnode;
        dltnode = head;
        head = head.next;
        head.prev = null;
        dltnode.next = null;
        dltnode.prev = null;
        size--;
        System.out.println("The deleted node is : NULL <--> "+dltnode.data+" <--> NULL");
    }

    public void delete_end(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node dltnode;
        dltnode = tail;
        tail = tail.prev;
        tail.next = null;
        dltnode.next = null;
        dltnode.prev = null;
        size--;
        System.out.println("The deleted node is : NULL <--> "+dltnode.data+" <--> NULL");
    }

    public void delete_any_pos(int n){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(n>size){
            System.out.println("Index out of bound");
            return;
        }
        Node dltnode;
        Node current = head;
        while(--n > 0){
            current = current.next;
        }
        dltnode = current;
        current = current.prev;
        current.next = dltnode.next;
        dltnode.next.prev = current;
        dltnode.next = null;
        dltnode.prev = null;
        size--;
        System.out.println("The deleted node is : NULL <--> "+dltnode.data+" <--> NULL");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyDelete obj = new DoublyDelete();
        obj.create(23);
        obj.create(12);
        obj.create(98);
        obj.create(74);
        obj.create(109);
        obj.create(66);
        obj.create(8);
        obj.create(19);

        int choice = 1;

        while(choice != 0){
            System.out.println("Enter 1 to delete from the beginning\nEnter 2 to delete from the end\nEnter 3 to delete from any position\nEnter 4 to print the list\nEnter 0 to end:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    obj.delete_beg();
                    System.out.println();
                    break;
                case 2:
                    obj.delete_end();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the position from where you want to delete the element: ");
                    int n = sc.nextInt();
                    obj.delete_any_pos(n);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("The List after deletion is: ");
                    obj.printlist();
                    System.out.println();
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
