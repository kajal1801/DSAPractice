class Node{
    int key;
    Node right, left;
    Node(int k){
        key = k;
    }
}

public class TreeSize {
    
    public int calculateSize(Node root){
        if(root == null){
            return 0;
        }
        return calculateSize(root.left) + calculateSize(root.right) + 1;
    }

    public static void main(String args[]){
        TreeSize obj = new TreeSize();
        Node root = new Node(12);
        root.left = new Node(45);
        root.right = new Node(69);
        root.left.left = new Node(56);
        root.left.right = new Node(89);
        root.right.right = new Node(90);

        int size = obj.calculateSize(root);
        System.out.println("Size of the given tree is : "+size);
    }
}
