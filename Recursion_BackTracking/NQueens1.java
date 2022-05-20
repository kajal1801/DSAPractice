import java.util.*;
class NQueens1 {

    // Main solution function
    public static List < List < String >> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
        dfs(0, board, res);
        return res;
    }

    // Validating function
    static boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;

        // UpperDiagonal
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') 
                return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;

        // left side
        while (col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
        }

        row = duprow;
        col = dupcol;

        // Lower Diagonal
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') 
                return false;
            col--;
            row++;
        }
        return true;
    }

    // Recursive Function
    static void dfs(int col, char[][] board, List < List < String >> res) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    // Constructing a List function
    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    // Main Method
    public static void main(String args[]) {
        int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
        
    }
}

// Time Complexity: O( N^3 ) 

// Space Complexity: O( N^2 )