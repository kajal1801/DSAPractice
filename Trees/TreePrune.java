class TreeNode5 {
    int val;
    TreeNode5 left;
    TreeNode5 right;
    TreeNode5() {}
    TreeNode5(int val) { this.val = val; }
    TreeNode5(int val, TreeNode5 left, TreeNode5 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class TreePrune {

    public TreeNode5 prune(TreeNode5 curr){
        if(curr == null){
            return null;
        }
        
        TreeNode5 left = prune(curr.left);
        TreeNode5 right = prune(curr.right);
        if(left == null){
            curr.left = null;
        }
        if(right == null){
            curr.right = null;
        }
        
        if(left == null && right == null && curr.val == 0){
            curr = null;
            return null;
        }
        
        return curr;
    }
    public TreeNode5 pruneTree(TreeNode5 root) {
        return prune(root);
    }
}
