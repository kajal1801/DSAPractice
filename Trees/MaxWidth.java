import java.util.LinkedList;
import java.util.Queue;

class Node1{
    int key;
    Node1 right, left;
    Node1(int k){
        key = k;
    }
}

public class MaxWidth{
    public int maxwid(Node1 root){
        if(root == null){
            return 0;
        }
        int count = 0,res = 0;
        Queue<Node1> q = new LinkedList<Node1>();
        q.add(root);
        while(q.isEmpty() == false){
            count = q.size();
            res = Math.max(res,count);
            for(int i=0;i<count;i++){
                Node1 curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        MaxWidth obj = new MaxWidth();
        Node1 root = new Node1(30);
        root.left = new Node1(12);
        root.right = new Node1(45);
        root.left.left = new Node1(5);
        root.left.right =new Node1(20);
        root.right.left = new Node1(28);
        root.right.right = new Node1(56);
        root.left.right.left = new Node1(11);
        
        int ans = obj.maxwid(root);
        System.out.println("Max Width of the tree is : "+ans);
    }
}