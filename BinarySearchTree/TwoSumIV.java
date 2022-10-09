import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TwoSumIV {
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        int start = 0, end = list.size()-1;
        while(start < end){
            if((list.get(start) + list.get(end)) == k){
                return true;
            }
            else if((list.get(start) + list.get(end)) > k){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}