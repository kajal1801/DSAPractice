public class SearchMatrix{
    public static void main(String[] args) {
        int matrix[][] = {{1,3}};
        int target = 3;
        int row = -1;
        boolean f = false;
        for(int i = 0;i < matrix.length;i++){
            if(i > 0 && matrix[i][0] > target){
                row = i-1;
                break;
            }
        }
        if(row < 0){
            row = 0;
        }
        for(int i = 0;i < matrix[0].length;i++){
            if(matrix[row][i] == target){
                f = true;
            }
        }
        System.out.println(f);
    }
}