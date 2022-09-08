class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4() {}
    TreeNode4(int val) { this.val = val; }
    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MinDepth {
    public int height(TreeNode4 root){
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
    public int minDepth(TreeNode4 root) {
        return height(root);
    }
}
