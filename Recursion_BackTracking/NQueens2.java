import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NQueens2 {
    
    // Main Solution function
    public List<List<String>> solve(int n){
        char queen[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int  j = 0;j<n;j++){
                queen[i][j] = '.';
            }
        }
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2*n - 1];
        int lowerDiagonal[] = new int[2*n - 1];
        List<List<String>> res = new ArrayList<List<String>>();
        createQueens(0, queen, leftRow, upperDiagonal, lowerDiagonal, res);
        return res;
    }

    public void createQueens(int col, char[][] queen, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, List<List<String>> res){
        if(col == queen.length){
            res.add(construct(queen));
            return;
        }

        for(int i = 0;i<queen.length;i++){
            if(leftRow[i] == 0 && upperDiagonal[queen.length - 1 + col - i] == 0 && lowerDiagonal[i + col] == 0){
                queen[i][col] = 'Q';
                leftRow[i] = 1;
                upperDiagonal[queen.length - 1 + col - i] = 1;
                lowerDiagonal[i + col] = 1;
                createQueens(col + 1, queen, leftRow, upperDiagonal, lowerDiagonal, res);
                queen[i][col] = '.';
                leftRow[i] = 0;
                upperDiagonal[queen.length - 1 + col - i] = 0;
                lowerDiagonal[i + col] = 0;
            }
        }
    }

    public List<String> construct(char queen[][]){
        List<String> res = new LinkedList<String>();
        for(int i = 0;i < queen.length;i++){
            String s = new String(queen[i]);
            res.add(s);
        }
        return res;
    }

    public static void main(String args[]){
        NQueens2 obj = new NQueens2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Queens: ");
        int n = sc.nextInt();
        List<List<String>> res = obj.solve(n);
        int i = 1;
        for (List<String> list : res) {
            System.out.println("Arrangement " + i + ":");
            for(String s: list){
                System.out.println(s);
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
