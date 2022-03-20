import java.util.Scanner;

public class SimpleQueue{
    public final int MAX = 50;
    private int[] queue = new int[MAX];
    private int front, rear;

    public SimpleQueue(){
        front = -1;
        rear = -1;
    }

    public void enqueue(int data){
        if(rear == MAX-1){
            System.out.println("Queue is Full");
            return;
        }
        queue[++rear] = data;
        if(front == -1){
            front = 0;
        }
    }

    public void dequeue(){
        if(rear == -1 || front > rear){
            System.out.println("Queue is Empty");
            return;
        }
        int remove = queue[front++];
        System.out.println("The removed element is: "+ remove);
    }

    public void reverse(){
        int start = front, end = rear;
        while(start < end){
            int temp = queue[start];
            queue[start] = queue[end];
            queue[end] = temp;
            start++;
            end--;
        }
    }

    public void display(){
        for(int i = front;i<=rear;i++){
            System.out.print(queue[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SimpleQueue obj = new SimpleQueue();
        int choice  = 1;
        while(choice != 0){
            System.out.println("Enter 1 to insert an element into the Queue\nEnter 2 to delete an element from the Queue\nEnter 3  to reverse the Queue\nEnter 4 to display the Queue\nEnter 0 to exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data to be inserted: ");
                    int d = sc.nextInt();
                    obj.enqueue(d);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.reverse();
                    break;
                case 4:
                    obj.display();
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