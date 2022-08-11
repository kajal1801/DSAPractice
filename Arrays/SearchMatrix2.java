public class SearchMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rlow = 0, rhigh = matrix.length - 1;
        int row = searchRow(matrix, rlow, rhigh, target);
        int clow = 0, chigh = matrix[row].length - 1;
        return searchTarget(matrix, clow, chigh, target, row);
    }
    
    public int searchRow(int[][] matrix, int low, int high, int target){
        int row = 0;
        while(low <= high){
            int mid = (low+ high)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]){
                row = mid;
                break;
            }
            else if(target < matrix[mid][0]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return row;
    }
    
    public boolean searchTarget(int[][] matrix, int low, int high, int target, int row){
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(target < matrix[row][mid]){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
