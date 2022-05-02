class Node2{
    int key;
    Node2 right, left;
    Node2(int k){
        key = k;
    }
}

public class TreeSize {
    
    public int calculateSize(Node2 root){
        if(root == null){
            return 0;
        }
        return calculateSize(root.left) + calculateSize(root.right) + 1;
    }

    public static void main(String args[]){
        TreeSize obj = new TreeSize();
        Node2 root = new Node2(12);
        root.left = new Node2(45);
        root.right = new Node2(69);
        root.left.left = new Node2(56);
        root.left.right = new Node2(89);
        root.right.right = new Node2(90);

        int size = obj.calculateSize(root);
        System.out.println("Size of the given tree is : "+size);
    }
}
