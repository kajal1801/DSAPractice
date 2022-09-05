import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class LevelOrderNary{
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i < size;i++){
                Node temp = q.poll();
                curr.add(temp.val);
                for(Node child : temp.children){
                    q.add(child);
                }
            }
            list.add(curr);
        }
        return list;
    }
}