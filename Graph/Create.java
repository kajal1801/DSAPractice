import java.util.*;

class Create{
    public static void main(String[] args) {
        int n = 3, m = 3;
        // Storing in a matrix
        // int adj[][] = new int[n+1][n+1];

        // // edge 1--2
        // adj[1][2] = 1;
        // adj[2][1] = 1;

        // //edge 2--3
        // adj[2][3] = 1;
        // adj[3][2] = 1;

        // This type of storing is very expensive so we'll use ArrayList

        ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
        for(int i = 0;i <=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        // edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i = 0;i < n;i++){
            for(int j = 0;j < adj.get(i).size();j++){
                System.out.print(adj.get(i));
            }
        }
    }
}