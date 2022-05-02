class Node8{
    int key;
    Node8 left;
    Node8 right;
    Node8(int k){
        key = k;
    }
}

public class PostorderTraversal {

    public void postorder(Node8 root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String args[]){
        Node8 root = new Node8(10);
        root.left = new Node8(20);
        root.right = new Node8(30);
        root.right.left = new Node8(40);
        root.right.right = new Node8(50);

        PostorderTraversal obj = new PostorderTraversal();
        obj.postorder(root);
        System.out.println();
    }
}
