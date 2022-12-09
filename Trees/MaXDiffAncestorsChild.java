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
public class MaXDiffAncestorsChild {
    public int maxDiff(TreeNode11 root, int maxVal, int minVal){
        if(root == null){
            return (maxVal - minVal);
        }

        maxVal = Math.max(maxVal, root.val);
        minVal = Math.min(minVal, root.val);
        
        return Math.max(maxDiff(root.left, maxVal, minVal), maxDiff(root.right, maxVal, minVal));
    }

    public int maxAncestorDiff(TreeNode11 root) {
        int minVal = 0, maxVal = 100000;
        return maxDiff(root, minVal, maxVal);
    }
}
