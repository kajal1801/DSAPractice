import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class PreOrderLoop
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        // Code here
        Node curr = root;
        Stack<Node> st = new Stack<Node>();
        while(curr != null || !st.isEmpty()){
            while(curr != null){
                list.add(curr.data);
                if(curr.right != null){
                    st.push(curr.right);
                }
                curr = curr.left;
            }
            
            if(!st.isEmpty()){
                curr = st.pop();
            }
        }
        
        return list;
    }

}