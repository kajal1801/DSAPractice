public class NumberofProvinces {
    public void dfs(int node, int[][] isConnected, boolean vis[]){
        vis[node] = true;
        for(int j = 0; j < isConnected.length;j++){
            if(!vis[j] && isConnected[node][j] == 1){
                vis[j] = true;
                dfs(j, isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        
        boolean vis[] = new boolean[isConnected.length];
        int count = 0;
        for(int i = 0;i < isConnected.length;i++){
            if(vis[i] == false){
                count++;
                dfs(i, isConnected, vis);
            }
        }
        return count;
    }
}
