// GFG Question
import java.util.ArrayList;
import java.util.Stack;

class Node9{
    int data;
    Node9 right;
    Node9 left;
    Node9(int d){
        data = d;
    }
}

public class PostOrderLoop{
    ArrayList<Integer> postOrder(Node9 root)
    {
       // Your code goes here
       ArrayList<Integer> list = new ArrayList<Integer>();
       if(root == null){
           return list;
       }
       Stack<Node9> st = new Stack<Node9>();
       Node9 curr = root;
       while(curr != null || !st.isEmpty()){
           if(curr != null){
               st.push(curr);
               curr = curr.left;
           }
           else{
               Node9 temp = st.peek().right;
               if(temp == null){
                   temp = st.peek();
                   st.pop();
                   list.add(temp.data);
                   while(!st.isEmpty() && temp == st.peek().right){
                       temp = st.peek();
                       st.pop();
                       list.add(temp.data);
                   }
               }
               else{
                   curr = temp;
               }
           }
       }
       return list;
    }
}