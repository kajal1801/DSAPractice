import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode14 {
    int val;
    TreeNode14 left;
    TreeNode14 right;
    TreeNode14() {}
    TreeNode14(int val) { this.val = val; }
    TreeNode14(int val, TreeNode14 left, TreeNode14 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode14 root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        Queue<TreeNode14> q = new LinkedList<TreeNode14>();
        q.add(root);
        int i = 0;
        while(!q.isEmpty())
        {
            List<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for(int j = 0; j < size;j++){
                TreeNode14 temp = q.poll();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                curr.add(temp.val);
            }
            if(i%2 != 0){
                Collections.reverse(curr);
            }
            list.add(curr);
            i++;
        }
        return list;
    }
}
