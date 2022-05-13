import java.util.LinkedList;
import java.util.Queue;

class Node21{
    int key;
    Node21 right, left;
    Node21(int k){
        key = k;
    }
}

public class ChildrenSumIterative {
    
    public static boolean check(Node21 root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        boolean flag = true;
        Queue<Node21> q = new LinkedList<Node21>();
        q.add(root);
        while(!q.isEmpty()){
            Node21 curr = q.poll();
            int sum = 0;
            if(curr.left == null && curr.right == null){
                continue;
            }
            if(curr.left != null){
                sum += curr.left.key;
                q.add(curr.left);
            }
            if(curr.right != null){
                sum += curr.right.key;
                q.add(curr.right);
            }
            if(sum != curr.key){
                flag = false;
                break;
            }    
        }
        return flag;
    }

    public static void main(String args[]){
        Node21 root = new Node21(30);
        root.left = new Node21(15);
        root.right = new Node21(15);
        root.right.left = new Node21(8);
        root.right.right = new Node21(7);
        root.right.right.left = new Node21(17);
        
        boolean k = check(root);
        if(k){
            System.out.println("The Chilren's sum is equal to the parent");
        }
        else{
            System.out.println("The Chilren's sum is not equal to the parent");
        }
    }    
}
