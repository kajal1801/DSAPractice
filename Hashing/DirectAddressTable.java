import java.util.Scanner;

public class DirectAddressTable{
    private static boolean arr[] = new boolean[999];
    public void insert(int index){
        arr[index] = true;
    }

    public boolean search(int index){
        return arr[index];
    }

    public void delete(int index){
        arr[index] = false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DirectAddressTable obj = new DirectAddressTable();
        int choice = 1,i;
        while(choice != 0){
            System.out.println("Enter 1 to insert\nEnter 2 to delete\nEnter 3 to search\nEnter 0 to exit\nEnter your choice:");
            choice  = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the index at which you want to enter the value:");
                    i = sc.nextInt();
                    obj.insert(i);
                    break;
                case 2:
                    System.out.println("Enter the index from which you want to delete the value:");
                    i = sc.nextInt();
                    obj.delete(i);
                    break;
                case 3:
                    System.out.println("Enter the value that you want to search:");
                    i = sc.nextInt();
                    boolean k = obj.search(i);
                    System.out.println(k);
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