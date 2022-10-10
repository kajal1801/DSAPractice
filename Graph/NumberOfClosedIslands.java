public class NumberOfClosedIslands {
    public static void dfs(int[][] grid, boolean vis[][], int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] ==1 || vis[i][j]){
            return;
        }
        
        vis[i][j] = true;
        if(grid[i][j] == 0){
            grid[i][j] = 1;
        }
        dfs(grid, vis, i-1, j);
        dfs(grid, vis, i, j-1);
        dfs(grid, vis, i, j+1);
        dfs(grid, vis, i+1, j);
    }
    public static int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        boolean vis[][] = new boolean[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(i ==0 || i == n-1 || j == 0 || j == m-1){
                    if(grid[i][j] == 0){
                        dfs(grid, vis, i, j);
                    }
                }
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 0 && !vis[i][j]){
                    count++;
                    dfs(grid, vis, i, j); 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1,1,1,0}, {1,0,0,0,0,1,1,0}, {1,0,1,0,1,1,1,0}, {1,0,0,0,0,1,0,1}, {1,1,1,1,1,1,1,0}};

        int count = closedIsland(grid);

        System.out.println(count);
    }
}
