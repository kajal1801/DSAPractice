class TreeNode8 {
    int val;
    TreeNode8 left;
    TreeNode8 right;
    TreeNode8() {}
    TreeNode8(int val) { this.val = val; }
    TreeNode8(int val, TreeNode8 left, TreeNode8 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class InvertNode {
    public TreeNode8 invert(TreeNode8 root){
        if(root == null){
            return null;
        }
        TreeNode8 temp = root.right;
        root.right = root.left;
        root.left = temp;
        TreeNode8 leftSide = invert(root.left);
        TreeNode8 rightSide = invert(root.right);
        
        root.right = rightSide;
        root.left = leftSide;
        return root;
    }
    public TreeNode8 invertTree(TreeNode8 root) {
        return invert(root);
    }
}
