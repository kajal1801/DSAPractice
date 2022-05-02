// GFG Quesrtion
import java.util.ArrayList;
import java.util.Stack;

class Node16 {
    int data;
    Node16 left, right;
   Node16(int item)    {
        data = item;
        left = right = null;
    }
}
public class InOrderLoop {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node16 root) {
        // Code
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Stack<Node16> st = new Stack<Node16>();
        Node16 curr = root;
        while(curr != null || !st.isEmpty()){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                curr = st.pop();
                list.add(curr.data);
                curr = curr.right;
            }
        }
        return list;
    }
}
