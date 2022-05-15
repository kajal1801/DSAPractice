import java.util.*;
class MaxCons {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int maxm = 0;
        maxm = special[0] - bottom;
        int smax = 0;
        for(int i = 1;i<special.length;i++){
            smax = Math.max(smax,(special[i] - special[i-1]));  
        }
        maxm = Math.max(maxm, (top - special[special.length - 1]));
        if(smax > maxm){
            maxm = smax - 1;
        }
        return maxm;
    }
}