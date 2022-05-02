class Node6{
    int key;
    Node6 left;
    Node6 right;
    Node6(int k){
        key = k;
    }
}

public class PreorderTraversal {

    public void preorder(Node6 root){
        if(root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]){
        Node6 root = new Node6(10);
        root.left = new Node6(20);
        root.right = new Node6(30);
        root.right.left = new Node6(40);
        root.right.right = new Node6(50);

        PreorderTraversal obj = new PreorderTraversal();
        obj.preorder(root);
        System.out.println();
    }
}
