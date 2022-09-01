import java.util.Stack;
import javafx.util.Pair;
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

public class GoodNodes {
    public int goodNodes(TreeNode root) {
        if(root.left == null && root.right == null){
            return 1;
        }
        int max = root.val;
        Stack<Pair<TreeNode,Integer>> st = new Stack<Pair<TreeNode,Integer>>();
        int count = 0;
        st.push(new Pair(root,root.val));
        while(!st.isEmpty()){
            TreeNode temp = st.peek().getKey();
            max = st.peek().getValue();
            st.pop();
            if(temp.val >= max){
                count++;
                max = temp.val;
            }
            if(temp.right != null){
                st.push(new Pair(temp.right,max));
            }
            if(temp.left != null){
                st.push(new Pair(temp.left,max));
            }
        }
        return count;
    }
}
