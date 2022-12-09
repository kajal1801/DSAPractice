import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class LevelOrderII{
    public List<List<Integer>> levelOrderBottom(TreeNode12 root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<TreeNode12> q = new LinkedList<TreeNode12>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i < size;i++){
                TreeNode12 temp = q.poll();
                if(temp != null){
                    curr.add(temp.val);
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            list.add(0,curr);
        }
        return list;
    }
}