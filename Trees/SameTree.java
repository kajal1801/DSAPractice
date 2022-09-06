public class SameTree{
    public boolean sameT(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return (p==q);
        }
        return (p.val == q.val) && sameT(p.left, q.left) && sameT(p.right, q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return sameT(p,q);
    }
}