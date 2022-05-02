// GFG Question
import java.util.ArrayList;
import java.util.Stack;

class Node7{
    int data;
    Node7 left,right;
    Node7(int d){
        data=d;
        left=right=null;
    }
}

public class PreOrderLoop
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node7 root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        // Code here
        Node7 curr = root;
        Stack<Node7> st = new Stack<Node7>();
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