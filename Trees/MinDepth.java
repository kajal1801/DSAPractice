class TreeNode6 {
    int val;
    TreeNode6 left;
    TreeNode6 right;
    TreeNode6() {}
    TreeNode6(int val) { this.val = val; }
    TreeNode6(int val, TreeNode6 left, TreeNode6 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MinDepth {
    public int height(TreeNode6 root){
        if(root == null){
            return 0;
        }
        
        if(root.left == null){
            return height(root.right) + 1;
        }
        if(root.right == null){
            return height(root.left) + 1;
        }
        return Math.min(height(root.left), height(root.right)) + 1;
    }
    public int minDepth(TreeNode6 root) {
        return height(root);
    }
}
