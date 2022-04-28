// GFG Question
import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node right;
    Node left;
    Node(int d){
        data = d;
    }
}

public class PostOrderLoop{
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> list = new ArrayList<Integer>();
       if(root == null){
           return list;
       }
       Stack<Node> st = new Stack<Node>();
       Node curr = root;
       while(curr != null || !st.isEmpty()){
           if(curr != null){
               st.push(curr);
               curr = curr.left;
           }
           else{
               Node temp = st.peek().right;
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