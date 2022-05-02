class Node10{
    int data;
    Node10 right, left;
    Node10(int k){
        data = k;
    }
}

class MinMaxTree{
    public static int findMax(Node10 root){
        //code here
        if(root ==  null){
            return Integer.MIN_VALUE;
        }
        return Math.max(Math.max(findMax(root.left),findMax(root.right)),root.data);
    }
    public static int findMin(Node10 root){
        //code here
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(Math.min(findMin(root.left),findMin(root.right)),root.data);
    }

    public static void main(String args[]){
        Node10 root = new Node10(12);
        root.left = new Node10(45);
        root.right = new Node10(69);
        root.left.left = new Node10(56);
        root.left.right = new Node10(89);
        root.right.right = new Node10(90);

        int ans;
        ans = findMax(root);
        System.out.println("Maximum element in the given tree is : "+ans);
        ans = findMin(root);
        System.out.println("Minimum element in the given tree is : "+ans);
    }
}