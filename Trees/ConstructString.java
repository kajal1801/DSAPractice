class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2() {}
    TreeNode2(int val) { this.val = val; }
    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConstructString {
    public String construct(TreeNode2 curr){
        if(curr == null){
            return "";
        }
        String s = Integer.toString(curr.val);
        if(curr.left != null){
            s = s + "(" + construct(curr.left) + ")";
        }
        else if(curr.right != null){
            s += "()";
        }
        if(curr.right != null){
            s = s + "(" + construct(curr.right) + ")";
        }
        return s;
    }
    public String tree2str(TreeNode2 root) {
        return construct(root);
    }
}
