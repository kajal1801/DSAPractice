class TreeNode11 {
    int val;
    TreeNode11 left;
    TreeNode11 right;
    TreeNode11() {}
    TreeNode11(int val) { this.val = val; }
    TreeNode11(int val, TreeNode11 left, TreeNode11 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PathSum {
    public boolean hasPathSum(TreeNode11 root, int targetSum) {
        if(root == null){
            return false;
        }
        if(targetSum - root.val == 0 && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
