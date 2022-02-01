import java.util.Scanner;

public class CircularDelete extends CircularLL{
    
    public void delete_beg(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node dltnode;
        dltnode = head;
        head = head.next;
        tail.next = head;
        dltnode.next = null;
        size--;
        System.out.println("The deleted node is: " + dltnode.data + " --> NULL");
    }

    public void delete_end(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        Node dltnode = tail;
        tail = current;
        tail.next = head;
        dltnode.next = null;
        size--;
        System.out.println("The deleted node is: " + dltnode.data + " --> NULL");
    }

    public void delete_any_pos(int n){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node dltnode = head;
        while(--n > 1){
            dltnode = dltnode.next;
        }
        Node temp = dltnode;
        dltnode = dltnode.next;
        temp.next = dltnode.next;
        dltnode.next = null;
        size--;
        System.out.println("The deleted node is: " + dltnode.data + " --> NULL");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CircularDelete obj = new CircularDelete();
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
