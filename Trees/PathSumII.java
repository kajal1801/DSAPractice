import java.util.ArrayList;
import java.util.List;

class TreeNode12 {
    int val;
    TreeNode12 left;
    TreeNode12 right;
    TreeNode12() {}
    TreeNode12(int val) { this.val = val; }
    TreeNode12(int val, TreeNode12 left, TreeNode12 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class PathSumII{
    public void path(TreeNode12 root, int targetSum, int currentSum, List<Integer> curr, List<List<Integer>> list){
        if(root == null){
            return;
        }
        curr.add(root.val);
        currentSum += root.val;
        if(root.right == null && root.left == null){
            if(targetSum == currentSum){
                list.add(new ArrayList<Integer>(curr));
            }
            curr.remove(curr.size()-1);
            return;
        }
        path(root.left, targetSum, currentSum, curr, list);
        path(root.right, targetSum , currentSum, curr, list);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode12 root, int targetSum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        path(root, targetSum, 0, curr, list);
        return list;
    }
}