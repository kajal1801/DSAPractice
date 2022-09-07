
 class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class SameTree{
    public boolean sameT(TreeNode1 p, TreeNode1 q){
        if(p == null || q == null){
            return (p==q);
        }
        return (p.val == q.val) && sameT(p.left, q.left) && sameT(p.right, q.right);
    }
    public boolean isSameTree(TreeNode1 p, TreeNode1 q) {
        return sameT(p,q);
    }
}