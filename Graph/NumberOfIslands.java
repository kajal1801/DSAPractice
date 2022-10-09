public class NumberOfIslands {
    public void dfs(char[][] grid, boolean[][] vis, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || vis[i][j]) {
            return;
        }
        
        vis[i][j] = true;
        dfs(grid, vis, i-1,j);
        dfs(grid, vis, i-1, j-1);
        dfs(grid, vis, i, j-1);
        dfs(grid, vis, i-1, j+1);
        dfs(grid, vis, i, j+1);
        dfs(grid, vis, i+1, j);
        dfs(grid, vis,i+1,j-1);
        dfs(grid, vis, i+1, j+1);
    }
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(vis[i][j] == false && grid[i][j] == '1'){
                    dfs(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}
