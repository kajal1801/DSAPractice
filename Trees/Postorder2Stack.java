import java.util.*;

class Node24{
    int key;
    Node24 right, left;
    Node24(int k){
        key = k;
    }
}

class Postorder2Stack{
    public void postOrder(Node24 root, List<Integer> ps){
        Stack<Node24> s1 = new Stack<Node24>();
        Stack<Node24> s2 = new Stack<Node24>();

        if(root == null){
            return;
        }
        s1.push(root);
        while(s1.isEmpty() == false){
            root = s1.pop();
            s2.push(root);
            if(root.left != null){
                s1.push(root.left);
            }
            if(root.right != null){
                s1.push(root.right);
            }
        }
        while(s2.isEmpty() == false){
            ps.add(s2.pop().key);
        }
    }

    public static void main(String args[]){
        Postorder2Stack obj = new Postorder2Stack();
        Node24 root = new Node24(1);
        root.left = new Node24(2);
        root.right = new Node24(3);
        root.left.right = new Node24(5);
        root.left.left = new Node24(4);
        root.right.left = new Node24(6);
        root.right.left.right = new Node24(7);
        root.right.left.right.right = new Node24(8);

        List<Integer> ps = new ArrayList<Integer>();
        obj.postOrder(root, ps);
        for (int integer : ps) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}