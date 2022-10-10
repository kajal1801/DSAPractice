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
