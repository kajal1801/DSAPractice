import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderII{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i < size;i++){
                TreeNode temp = q.poll();
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