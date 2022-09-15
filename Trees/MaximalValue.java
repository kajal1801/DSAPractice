class Tree1 {
  int val;
  Tree1 left;
  Tree1 right;
  Tree1(int data){
    this.val = data;
    this.right = null;
    this.left = null;
  }
}
 
public class MaximalValue {
    int count = 0;
    public int sum(Tree1 root, int max){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            count++;
            return root.val;
        }

        int l = sum(root.left, max);
        int r = sum(root.right, max);

        if(l <= root.val && r <= root.val){
            count++;
        }

        max = Math.max(Math.max(l,r), root.val);
        return max;
    }
    public int solve(Tree1 root) {
        if(root == null){
            return 0;
        }
        sum(root, Integer.MIN_VALUE);
        return count;
    }
    public static void main(String[] args) {
        Tree1 root = new Tree1(1);
        root.right = new Tree1(2);
        root.right.left = new Tree1(1);
        

        MaximalValue obj = new MaximalValue();
        int ans = obj.solve(root);
        System.out.println(ans);
    }
}
