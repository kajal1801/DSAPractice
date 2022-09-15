class Tree2 {
    int val;
    Tree2 left;
    Tree2 right;
    Tree2(int data){
        this.val = data;
        this.right = null;
        this.left = null;
    }
}

class LLNode {
    int val;
    LLNode next;
}

public class LLtoBT { 
    Tree2 root, temp;
    public Tree2 solve(LLNode node) {
        if(node == null){
            return null;
        }
        root = new Tree2(node.val);
        temp = root;
        while(node != null && node.next != null){
            if(node.next.val < node.val){
                temp.left = new Tree2(node.next.val);
                temp = temp.left;
            }
            else{
                temp.right = new Tree2(node.next.val);
                temp = temp.right;
            }
            node  = node.next;
            
        }
        return root;
    }
}
