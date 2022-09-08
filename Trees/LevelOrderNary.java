import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node30 {
    public int val;
    public List<Node30> children;

    public Node30() {}

    public Node30(int _val) {
        val = _val;
    }

    public Node30(int _val, List<Node30> _children) {
        val = _val;
        children = _children;
    }
}

public class LevelOrderNary{
    public List<List<Integer>> levelOrder(Node30 root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<Node30> q = new LinkedList<Node30>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i < size;i++){
                Node30 temp = q.poll();
                curr.add(temp.val);
                for(Node30 child : temp.children){
                    q.add(child);
                }
            }
            list.add(curr);
        }
        return list;
    }
}