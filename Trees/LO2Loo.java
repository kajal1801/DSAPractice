import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node right, left;
    Node(int k){
        key = k;
    }
}
public class LO2Loo {
    public void printlevel(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0;i < count; i++){
                Node curr = q.poll();
                System.out.print(curr.key + " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String argsp[])
    {
        LO2Loo obj = new LO2Loo();
        Node root = new Node(12);
        root.left = new Node(45);
        root.right = new Node(69);
        root.left.left = new Node(56);
        root.left.right = new Node(89);
        root.right.right = new Node(90);

        obj.printlevel(root);
    }
}
