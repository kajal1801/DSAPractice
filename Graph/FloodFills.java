// DFS
public class FloodFills {
    public void dfs(int[][] image, boolean vis[][], int sr, int sc, int color, int change){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != change || vis[sr][sc]){
            return;
        }
        
        vis[sr][sc] = true;
        image[sr][sc] = color;
        
        dfs(image, vis, sr-1, sc, color, change);
        dfs(image, vis, sr, sc-1, color, change);
        dfs(image, vis, sr, sc+1, color, change);
        dfs(image, vis, sr+1, sc, color, change);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        
        int change = image[sr][sc];
        boolean vis[][] = new boolean[n][m];
        dfs(image, vis, sr,sc, color, change);
        
        return image;
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

    public class FloodFills {
        public void bfs(int[][] image, boolean vis[][], int sr, int sc, int color, int change){
            vis[sr][sc] = true;
            image[sr][sc] = color;
            Queue<Pair> q = new LinkedList<Pair>();
            q.add(new Pair(sr, sc));
            
            int n = image.length;
            int m = image.length;

            while(!q.isEmpty()){
                int row = q.peek().first;
                int col = q.peek().second;
                q.remove();
                
                int upRow = row - 1;
                int leftCol = col - 1;
                int downRow = row + 1;
                int rightCol = col + 1;

                if(row >= 0 && row < n && leftCol >= 0 && leftCol < m && image[row][leftCol] == change && !vis[row][leftCol]){
                    image[row][leftCol] = color;
                    vis[row][leftCol] = true;
                    q.add(new Pair(row, leftCol));
                }
                if(upRow >= 0 && upRow < n && col >= 0 && col < m && image[upRow][col] == change && !vis[upRow][col]){
                    image[upRow][col] = color;
                    vis[upRow][col] = true;
                    q.add(new Pair(upRow, col));
                }
                if(row >= 0 && row < n && rightCol >= 0 && rightCol < m && image[row][rightCol] == change && !vis[row][rightCol]){
                    image[row][rightCol] = color;
                    vis[row][rightCol] = true;
                    q.add(new Pair(row, rightCol));
                }
                if(downRow >= 0 && downRow < n && col >= 0 && col < m && image[downRow][col] == change && !vis[downRow][col]){
                    image[downRow][col] = color;
                    vis[downRow][col] = true;
                    q.add(new Pair(downRow, col));
                }
            }
        }
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int n = image.length;
            int m = image[0].length;
            
            int change = image[sr][sc];
            boolean vis[][] = new boolean[n][m];
            bfs(image, vis, sr,sc, color, change);
            
            return image;
        }
    }
*/