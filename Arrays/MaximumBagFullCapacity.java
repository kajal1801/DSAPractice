import java.util.Arrays;

public class MaximumBagFullCapacity {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        int n = capacity.length;
        int[] difference = new int[n];
        for(int i = 0;i < n;i++){
            difference[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(difference);
        for(int i = 0;i < n;i++){
            if(difference[i] == 0){
                count++;
            }
            else if(difference[i] <= additionalRocks){
                additionalRocks -= difference[i];
                count++;
            }
        }
        return count;
    }
}
