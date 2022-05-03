class Node19{
    int key;
    Node19 left, right;
    Node19(int k){
        key = k;
    }
}

public class ConstructTree{
    int preIndex = 0;
    public Node19 cTree(int in[], int pre[], int is, int ie){
        if(is>ie){
            return null;
        }
        Node19 root = new Node19(pre[preIndex++]);
        int inIndex = 0;
        for(int i = is;i<=ie;i++){
            if(in[i] == root.key){
                inIndex = i;
                break;
            }
        }
        root.left = cTree(in,pre,is,inIndex-1);
        root.right = cTree(in,pre,inIndex+1,ie);
        return root;
    }

    public void postorder(Node19 root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String args[]){
        ConstructTree obj = new ConstructTree();
        int in[] = {20, 10, 40, 30, 50};
        int pre[] = {10, 20, 30, 40, 50};
        Node19 root = obj.cTree(in ,pre , 0, 4);
        obj.postorder(root);
        System.out.println();
    }
    
}