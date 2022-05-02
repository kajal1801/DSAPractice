class Node4{
    int key;
    Node4 right, left;
    Node4(int k){
        key = k;
    }
}

public class TreeLeftView {
    
    public int calculateSize(Node4 root){
        if(root == null){
            return 0;
        }
        return calculateSize(root.left) + calculateSize(root.right) + 1;
    }

    public static void main(String args[]){
        TreeLeftView obj = new TreeLeftView();
        Node4 root = new Node4(12);
        root.left = new Node4(45);
        root.right = new Node4(69);
        root.left.left = new Node4(56);
        root.left.right = new Node4(89);
        root.right.right = new Node4(90);

        int size = obj.calculateSize(root);
        System.out.println("Size of the given tree is : "+size);
    }
}

