class Sorting2DArrays {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2){
                if(arr1[k] < arr2[k]){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        return score;
    }
}