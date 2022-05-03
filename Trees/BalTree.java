class Node20{
    int key;
    Node20 left,right;
    Node20(int k){
        key = k;
    }
}

public class BalTree {
    boolean flag = true;
    public int bal(Node20 root){
        if(root == null){
            return 0;
        }
        int lh = bal(root.left);
        int rh = bal(root.right);
        if(Math.abs(lh-rh) > 1){
            flag = false;
        }
        return Math.max(rh,lh) + 1;
    }

    public void isBalanced(Node20 root){
        bal(root);
        System.out.println( (flag == true) ? "Yes! The tree is balanced" : "No! The tree is not balanced" );
    }

    public static void main(String args[]){
        BalTree obj = new BalTree();
        Node20 root = new Node20(12);
        root.left = new Node20(45);
        root.right = new Node20(69);
        root.left.left = new Node20(56);
        root.left.right = new Node20(89);
        root.right.right = new Node20(90);

        obj.isBalanced(root);
    }
}
