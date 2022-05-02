import java.util.LinkedList;
import java.util.Queue;

class Node13{
    int key;
    Node13 right;
    Node13 left;
    Node13(int k){
        key = k;
    }
}
public class LevelOrderLinebyLine {
    public void printLevel(Node13 root){
        if(root == null){
            return;
        }
        Queue<Node13> q = new LinkedList<Node13>();
        q.add(root);
        q.add(null);
        while(q.size() > 1){
            Node13 curr = q.poll();
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
        Node13 root = new Node13(12);
        root.left = new Node13(45);
        root.right = new Node13(69);
        root.left.left = new Node13(56);
        root.left.right = new Node13(89);
        root.right.right = new Node13(90);

        obj.printLevel(root);
    }
}
