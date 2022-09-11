public class FlipnInvertMatrix{
    public void reverse(int[] matrix){
        int start = 0, end = matrix.length - 1;
        while(start < end){
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
    }
    
    public int[][] solve(int[][] matrix) {
        
        if(matrix.length == 0){
            return matrix;
        }
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                if(matrix[i][j] == 0)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }
        for(int i = 0;i < matrix.length;i++){
            reverse(matrix[i]);
        }
        return matrix;
    }
}

