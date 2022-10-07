import java.util.ArrayList;

public class DfsGraph {
    public void dfsRecursive(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> list){
        vis[node] = true;
        list.add(node);
        
        for(int neighbour : adj.get(node)){
            if(!vis[neighbour]){
                vis[neighbour] = true;
                dfsRecursive(neighbour, adj, vis, list);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V+1];
        vis[0] =true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfsRecursive(0, adj, vis, list);
        return list;
    }
}
