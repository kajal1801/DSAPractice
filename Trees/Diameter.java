class TreeNode7 {
    int val;
    TreeNode7 left;
    TreeNode7 right;
    TreeNode7() {}
    TreeNode7(int val) { this.val = val; }
    TreeNode7(int val, TreeNode7 left, TreeNode7 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Diameter {
    public int height(TreeNode7 root, int[] ans){
        if(root == null){
            return 0;
        }
        int leftSide = height(root.left, ans);
        int rightSide = height(root.right, ans);
        ans[0] = Math.max(ans[0], leftSide+rightSide);
        return Math.max(leftSide, rightSide)+1;
    }
    public int diameterOfBinaryTree(TreeNode7 root) {
        int[] ans = new int[1];
        height(root, ans);
        return ans[0];
    }
}
