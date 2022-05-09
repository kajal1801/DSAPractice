import java.util.Stack; 
import java.util.*;

class Node21{
    int data;
    Node21 left;
    Node21 right;
    Node21(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class LOTSpiralM2
{	
    ArrayList<Integer> findSpiral(Node21 root) 
    {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Stack<Node21> st1 = new Stack<Node21>();
        Stack<Node21> st2 = new Stack<Node21>();
        
        st1.push(root);
        while(st1.isEmpty() == false || st2.isEmpty() == false){
            while(st1.isEmpty() == false){
                Node21 curr = st1.pop();
                list.add(curr.data);
                if(curr.right != null){
                    st2.push(curr.right);
                }
                if(curr.left != null){
                    st2.push(curr.left);
                }
            }
            
            while(st2.isEmpty() == false){
                Node21 curr = st2.pop();
                list.add(curr.data);
                if(curr.left != null){
                    st1.push(curr.left);
                }
                if(curr.right != null){
                    st1.push(curr.right);
                }
            }
        }
        return list;
    }
}