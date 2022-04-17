class Node{
    int key;
    Node right;
    Node left;
    Node(int k){
        key = k;
    }
}

public class TreeHeight {

    public int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.left = new Node(56);

        TreeHeight obj = new TreeHeight();
        int h = obj.height(root);
        System.out.println("The height of the tree = "+h);
    }
}
