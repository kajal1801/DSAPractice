import java.util.LinkedList;
import java.util.Queue;

class Node12{
    int key;
    Node12 right;
    Node12 left;
    Node12(int k){
        key = k;
    }
}

public class LevelOrderTraversal {
    
    public void printLevelOrder(Node12 root){
        if(root == null){
            return;
        }
        Queue<Node12> q = new LinkedList<Node12>();
        q.add(root);
        while(q.isEmpty() == false){
            Node12 curr = q.poll();
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
        Node12 root = new Node12(12);
        root.left = new Node12(45);
        root.right = new Node12(69);
        root.left.left = new Node12(56);
        root.left.right = new Node12(89);
        root.right.right = new Node12(90);

        obj.printLevelOrder(root);
    }
}
