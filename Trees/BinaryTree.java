class Node1{
    int key;
    Node1 left, right;
    Node1(int k){
        key = k;
    }
}

public class BinaryTree{
    public static void main(String args[]){
        Node1 root = new Node1(10);
        root.left = new Node1(20);
        root.right = new Node1(30);
        root.left.left = new Node1(40);
    }
}