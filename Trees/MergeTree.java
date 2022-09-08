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

public class MergeTree {
    public TreeNode4 merge(TreeNode4 root1, TreeNode4 root2){
        if(root1 == null && root2 == null){
            return null;
        }
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        TreeNode4 root = new TreeNode4(root1.val + root2.val);
        root.left = merge(root1.left, root2.left);
        root.right = merge(root1.right, root2.right);
        return root;
    }
    public TreeNode4 mergeTrees(TreeNode4 root1, TreeNode4 root2) {
        return merge(root1, root2);
    }
}
