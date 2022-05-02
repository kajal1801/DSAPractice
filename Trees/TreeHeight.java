class Node5{
    int key;
    Node5 right;
    Node5 left;
    Node5(int k){
        key = k;
    }
}

public class TreeHeight {

    public int height(Node5 root){
        if(root == null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public static void main(String args[]){
        Node5 root = new Node5(10);
        root.left = new Node5(8);
        root.right = new Node5(30);
        root.right.left = new Node5(40);
        root.right.right = new Node5(50);
        root.right.right.left = new Node5(56);

        TreeHeight obj = new TreeHeight();
        int h = obj.height(root);
        System.out.println("The height of the tree = "+h);
    }
}
