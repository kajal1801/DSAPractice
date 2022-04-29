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
public class LevelOrderLinebyLine {
    public void printLevel(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size() > 1){
            Node curr = q.poll();
            if(curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
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
        LevelOrderLinebyLine obj = new LevelOrderLinebyLine();
        Node root = new Node(12);
        root.left = new Node(45);
        root.right = new Node(69);
        root.left.left = new Node(56);
        root.left.right = new Node(89);
        root.right.right = new Node(90);

        obj.printLevel(root);
    }
}
