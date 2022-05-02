import java.util.LinkedList;
import java.util.Queue;

class Node3{
    int key;
    Node3 right, left;
    Node3(int k){
        key = k;
    }
}

public class TreeSizeIterative {
    
    public int calculateSize(Node3 root){
        if(root == null){
            return 0;
        }
        Queue<Node3> q = new LinkedList<Node3>();
        int count = 0;
        q.add(root);
        while(q.isEmpty() == false){
            count++;
            Node3 curr = q.poll();
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        return count;
    }

    public static void main(String args[]){
        TreeSizeIterative obj = new TreeSizeIterative();
        Node3 root = new Node3(12);
        root.left = new Node3(45);
        root.right = new Node3(69);
        root.left.left = new Node3(56);
        root.left.right = new Node3(89);
        root.right.right = new Node3(90);

        int size = obj.calculateSize(root);
        System.out.println("Size of the given tree is : "+size);
    }
}
