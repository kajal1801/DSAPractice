import java.util.HashMap;
import java.util.Map;

/*
You are given a list of songs where the ith song has a duration of time[i] seconds.

Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.

 

Example 1:

Input: time = [30,20,150,100,40]
Output: 3
Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60
Example 2:

Input: time = [60,60,60]
Output: 3
Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 

Constraints:

1 <= time.length <= 6 * 104
1 <= time[i] <= 500
*/
public class Timemod60 {
    /*
        O(N^2) Approach:
        public static void main(String[] args) {
            int[] time = {30, 20, 150, 100, 40};
            int c = 0;
            for(int i = 0;i < time.length;i++){
                for(int j = i+1; j < time.length;j++){
                    if((time[i] + time[j]) % 60 == 0){
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    */
    public static void main(String[] args) {
        int[] time = {60, 60, 60};
        int c = 0;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < time.length;i++){
            int k = ((time[i]/60)+1)*60 - time[i];
            if(map.containsKey(k)){
                c += map.get(k);
            }
            map.put(time[i], map.getOrDefault(time[i], 0) + 1);   
        }
        System.out.println(c);
    }

}
