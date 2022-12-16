import java.util.Stack;

class QueueusingStack {
    Stack<Integer> q;
    public QueueusingStack() {
        q = new Stack<Integer>();
    }
    
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!q.isEmpty()){
            temp.push(q.pop());
        }
        q.push(x);
        while(!temp.isEmpty()){
            q.push(temp.pop());
        }
    }
    
    public int pop() {
        return q.pop();
    }
    
    public int peek() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}