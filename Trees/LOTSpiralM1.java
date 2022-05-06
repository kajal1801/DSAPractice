import java.util.LinkedList; 
import java.util.Queue; 
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class LOTSpiralM1
{	
    ArrayList<Integer> findSpiral(Node root) 
    {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Queue<Node> q = new LinkedList<Node>();
        Stack<Integer> st = new Stack<Integer>();
        boolean reverse = true;
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0;i<count;i++){
                Node curr = q.poll();
                if(reverse == true){
                    st.push(curr.data);
                }
                else{
                    list.add(curr.data);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(reverse == true){
                while(st.isEmpty() == false){
                    int s = st.pop();
                    list.add(s);
                }
            }
            if(reverse == true){
                reverse = false;
            }
            else{
                reverse = true;
            }
        }
        return list;
    }
}