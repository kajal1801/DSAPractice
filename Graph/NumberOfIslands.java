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


// BFS

/*
    class Pair{
        int first, second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    class Solution {
        // Function to find the number of islands.
        public void bfs(char[][] grid, boolean[][] vis, int i, int j){
            vis[i][j] = true;
            Queue<Pair> q = new LinkedList<Pair>();
            q.add(new Pair(i,j));
            
            while(!q.isEmpty()){
                int row = q.peek().first;
                int col = q.peek().second;
                q.remove();
                
                for(int delrow = -1; delrow <= 1; delrow++){
                    for(int delcol = -1; delcol <= 1; delcol++){
                        int nrow = row + delrow;
                        int ncol = col + delcol;
                        
                        if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && grid[nrow][ncol] == '1' && !vis[nrow][ncol]){
                            vis[nrow][ncol] = true;
                            q.add(new Pair(nrow, ncol));
                        }
                    }
                }
            }
        }
        public int numIslands(char[][] grid) {
            // Code here
            int n = grid.length;
            int m = grid[0].length;
            int count = 0;
            boolean[][] vis = new boolean[n][m];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++){
                    if(!vis[i][j] && grid[i][j] == '1'){
                        count++;
                        bfs(grid, vis, i, j);
                    }
                }
            }
            return count;
        }
    }
*/
