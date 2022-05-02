class Node15{
    int key;
    Node15 left;
    Node15 right;
    Node15(int k){
        key = k;
    }
}

public class InorderTraversal {
    public void inorder(Node15 root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " --> ");
            inorder(root.right);
        }
    }

    public static void main(String args[]){
        Node15 root = new Node15(10);
        root.left = new Node15(20);
        root.right = new Node15(30);
        root.left.left = new Node15(40);
        
        InorderTraversal obj = new InorderTraversal();
        obj.inorder(root);
        System.out.println();
    }
}
