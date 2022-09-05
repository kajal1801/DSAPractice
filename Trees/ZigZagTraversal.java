public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int i = 0;
        while(!q.isEmpty())
        {
            List<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for(int j = 0; j < size;j++){
                TreeNode temp = q.poll();
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
