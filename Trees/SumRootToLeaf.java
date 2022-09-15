class TreeNode14 {
    int val;
    TreeNode14 left;
    TreeNode14 right;
    TreeNode14() {}
    TreeNode14(int val) { this.val = val; }
    TreeNode14(int val, TreeNode14 left, TreeNode14 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class SumRootToLeaf {
    public int sum(TreeNode14 root, int sum){
        if(root == null){
            return 0;
        }
        if(root.right == null && root.left == null){
            return sum*10 + root.val;
        }
        int l = sum(root.left, sum*10 + root.val);
        int r = sum(root.right, sum*10 + root.val);
        
        return l+r;
    }
    public int sumNumbers(TreeNode14 root) {
        return sum(root, 0);
    }

}
