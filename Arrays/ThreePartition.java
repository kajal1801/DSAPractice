public abstract class ThreePartition {
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int start = 0, end = array.length - 1, mid = 0;
        while(mid <= end){
            if(array[mid] < a){
                int temp = array[mid];
                array[mid] = array[start];
                array[start] = temp;
                mid++;
                start++;
            }
            else if(array[mid] > b){
                int temp = array[mid];
                array[mid] = array[end];
                array[end] = temp;
                end--;
            }
            else{
                mid++;
            }
        }
    }
}
