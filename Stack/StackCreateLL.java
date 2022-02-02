public class StackCreateLL {
    
    static class Stack{
        int data;
        Stack next;
        Stack(int d){
            data = d;
            next = null;
        }
    }

    Stack head = null;

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("The current element on the top of the stack is: "+head.data);
    }

    public void push(int new_data){
        Stack newnode = new Stack(new_data);
        newnode.next = head;
        head = newnode;
        newnode = null;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The popped data is: "+head.data);
        head = head.next;
    }

    public static void main(String args[]){
        StackCreateLL obj = new StackCreateLL();
        obj.push(43);
        obj.push(21);
        obj.push(1);
        obj.peek();
        obj.pop();
        obj.peek();
        obj.pop();
        obj.peek();
        obj.pop();
        obj.pop();
    }
}
