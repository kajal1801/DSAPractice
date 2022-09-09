import java.util.ArrayList;
import java.util.List;

class TreeNode10 {
    int val;
    TreeNode10 left;
    TreeNode10 right;
    TreeNode10() {}
    TreeNode10(int val) { this.val = val; }
    TreeNode10(int val, TreeNode10 left, TreeNode10 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}

public class TreePathList{
    public void treePaths(TreeNode10 root, String s, List<String> list){
        if(root == null){
            return;
        }
        if(root.right == null && root.left == null){
            list.add(s+root.val);
            return;
        }
        treePaths(root.right, s+root.val+"->", list);
        treePaths(root.left, s+root.val+"->", list);
    }
    public List<String> binaryTreePaths(TreeNode10 root) {
        if(root == null){
            return new ArrayList<String>();
        }
        List<String> list = new ArrayList<String>();
        if(root.right == null && root.left == null){
            list.add(root.val+"");
            return list;
        }

        treePaths(root.left, root.val+"->",list);
        treePaths(root.right, root.val+"->", list);
        return list;
    }
}