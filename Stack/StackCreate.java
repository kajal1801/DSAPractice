import java.util.Scanner;

public class StackCreate{
    private int top;
    private int size;
    private int arr[];

    StackCreate(int n){
        top = -1;
        size = n;
        arr = new int[size];
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean isFull(){
        return (top>=size);
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The data at the top of the stack is: "+arr[top]);
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The popped data is: "+ arr[top--]);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n = sc.nextInt();
        StackCreate obj = new StackCreate(n);
        obj.push(23);
        obj.push(45);
        obj.push(84);
        obj.peek();
        obj.pop();
        obj.peek();
        obj.pop();
        obj.peek();
        obj.pop();
        obj.peek();
        sc.close();
    }
}