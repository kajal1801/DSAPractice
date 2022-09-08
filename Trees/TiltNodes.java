class TreeNode9 {
    int val;
    TreeNode9 left;
    TreeNode9 right;
    TreeNode9() {}
    TreeNode9(int val) { this.val = val; }
    TreeNode9(int val, TreeNode9 left, TreeNode9 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class TiltNodes {
    public int sumTilt(TreeNode9 root, int[] ans){
        if(root == null){
            return 0;
        }
        int l = 0, r = 0; 
        l = sumTilt(root.left, ans);
        r = sumTilt(root.right,ans);
        
        int subtree = l + r + root.val;
        root.val = Math.abs(l-r);
        ans[0] += root.val;
        
        return subtree;
    }
    public int findTilt(TreeNode9 root) {
        int[] ans = new int[1];
        sumTilt(root, ans);
        return ans[0];
    }
}
