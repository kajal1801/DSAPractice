import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node right, left;
    Node(int k){
        key = k;
    }
}

public class TreeSizeIterative {
    
    public int calculateSize(Node root){
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<Node>();
        int count = 0;
        q.add(root);
        while(q.isEmpty() == false){
            count++;
            Node curr = q.poll();
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
        Node root = new Node(12);
        root.left = new Node(45);
        root.right = new Node(69);
        root.left.left = new Node(56);
        root.left.right = new Node(89);
        root.right.right = new Node(90);

        int size = obj.calculateSize(root);
        System.out.println("Size of the given tree is : "+size);
    }
}
