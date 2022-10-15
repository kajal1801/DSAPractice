import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// BFS
public class KeysnRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] vis = new boolean[n];
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            int i = q.poll();
            
            for(int key : rooms.get(i)){
                if(!vis[key]){
                    vis[key] = true;
                    q.add(key);
                } 
            }  
        }
         
        for(boolean val : vis){
            if(!val){
                return false;
            }
        }
        
        return true;
    }
}


// DFS
/*
     public void dfs(int i, List<List<Integer>> rooms, boolean[] vis){
        vis[i] = true;
        
        for(int room : rooms.get(i)){
            if(!vis[room]){
                dfs(room, rooms, vis);
            }
        }
        
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        
        dfs(0, rooms, vis);
        for(boolean f : vis){
            if(!f){
                return false;
            }
        }
        
        return true;
    }
*/