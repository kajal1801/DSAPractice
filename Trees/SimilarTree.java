import java.util.LinkedList;
import java.util.Queue;

class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3() {}
    TreeNode3(int val) { this.val = val; }
    TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SimilarTree {
    public boolean isSymmetric(TreeNode3 root) {
        Queue<TreeNode3> q1 = new LinkedList<TreeNode3>();
        Queue<TreeNode3> q2 = new LinkedList<TreeNode3>();
        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode3 leftNode = q1.poll();
            TreeNode3 rightNode = q2.poll();
            if(leftNode == null && rightNode == null){
                continue;
            }
            if(leftNode == null && rightNode != null){
                return false;
            }
            if(leftNode != null && rightNode == null){
                return false;
            }
            if(leftNode.val != rightNode.val){
                return false;
            }
            q1.add(leftNode.left);
            q1.add(leftNode.right);
            q2.add(rightNode.right);
            q2.add(rightNode.left);
        }
        return (q1.size() == q2.size());
    }
}
