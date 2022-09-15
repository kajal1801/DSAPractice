class TreeNode13 {
    int val;
    TreeNode13 left;
    TreeNode13 right;
    TreeNode13() {}
    TreeNode13(int val) { this.val = val; }
    TreeNode13(int val, TreeNode13 left, TreeNode13 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class SmallLeaf {
    public String smallestLeaf(TreeNode13 root, String s){
        if(root == null){
            return "";
        }
        if(root.left == null && root.right == null){
            return ((char)(root.val + 97) + s);
        }
        String s1 = smallestLeaf(root.left, (char)(root.val + 97)+s);
        String s2 = smallestLeaf(root.right, (char)(root.val + 97)+s);
        
        if(s1.equals("")){
            return s2;
        }
        if(s2.equals("")){
            return s1;
        }
        if(s1.compareTo(s2) <= 0){
            s = s1;
        }
        else{
            s = s2;
        }
        return s;
    }
    public String smallestFromLeaf(TreeNode13 root) {
        return smallestLeaf(root, "");
    }
}
