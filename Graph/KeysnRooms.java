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
