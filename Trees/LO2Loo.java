import java.util.LinkedList;
import java.util.Queue;

class Node11{
    int key;
    Node11 right, left;
    Node11(int k){
        key = k;
    }
}
public class LO2Loo {
    public void printlevel(Node11 root){
        if(root == null){
            return;
        }
        Queue<Node11> q = new LinkedList<Node11>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0;i < count; i++){
                Node11 curr = q.poll();
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
        Node11 root = new Node11(12);
        root.left = new Node11(45);
        root.right = new Node11(69);
        root.left.left = new Node11(56);
        root.left.right = new Node11(89);
        root.right.right = new Node11(90);

        obj.printlevel(root);
    }
}
