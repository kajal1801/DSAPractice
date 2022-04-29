import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node right;
    Node left;
    Node(int k){
        key = k;
    }
}

public class LevelOrderTraversal {
    
    public void printLevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }

    public static void main(String args[]){
        LevelOrderTraversal obj = new LevelOrderTraversal();
        Node root = new Node(12);
        root.left = new Node(45);
        root.right = new Node(69);
        root.left.left = new Node(56);
        root.left.right = new Node(89);
        root.right.right = new Node(90);

        obj.printLevelOrder(root);
    }
}
