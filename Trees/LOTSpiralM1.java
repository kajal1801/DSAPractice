import java.util.LinkedList; 
import java.util.Queue; 
import java.util.*;

class Node22{
    int data;
    Node22 left;
    Node22 right;
    Node22(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class LOTSpiralM1
{	
    ArrayList<Integer> findSpiral(Node22 root) 
    {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Queue<Node22> q = new LinkedList<Node22>();
        Stack<Integer> st = new Stack<Integer>();
        boolean reverse = true;
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0;i<count;i++){
                Node22 curr = q.poll();
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