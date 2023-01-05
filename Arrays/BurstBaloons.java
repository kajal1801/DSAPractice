import java.util.Arrays;

class BurstBaloons{
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int count = 1, begin = 0;
        for(int i = 1;i < points.length;i++){
            if(points[begin][1] < points[i][0]){
                count++;
                begin = i;
            }
        }
        return count;
    }
}