import java.util.ArrayList;
import java.util.List;

class TreeNode15 {
    int val;
    TreeNode15 left;
    TreeNode15 right;
    TreeNode15() {}
    TreeNode15(int val) { this.val = val; }
    TreeNode15(int val, TreeNode15 left, TreeNode15 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } 
}
public class SplitBinaryTreeMAxProd {
    public long postOrder(TreeNode15 root, List<Long> list)
    {
        if(root == null){
            return 0;
        }

        long currSum = root.val + postOrder(root.left, list) + postOrder(root.right, list);
        list.add(currSum);
        return currSum;
    }
    public int maxProduct(TreeNode15 root) {
        List<Long> list = new ArrayList<Long>();
        int M = 1000000007;

        long total = postOrder(root, list);
        long prod = 1, max = Integer.MIN_VALUE;

        for(int i = 0;i < list.size();i++){
            long otherSum = total - list.get(i);
            prod = list.get(i) * otherSum;
            max = Math.max(max, prod);
        }

        return (int)(max % M);
    }
}
