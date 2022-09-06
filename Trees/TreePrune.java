class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class TreePrune {

    public TreeNode prune(TreeNode curr){
        if(curr == null){
            return null;
        }
        
        TreeNode left = prune(curr.left);
        TreeNode right = prune(curr.right);
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
    public TreeNode pruneTree(TreeNode root) {
        return prune(root);
    }
}
