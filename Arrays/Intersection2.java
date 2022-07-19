import java.util.*;
public class Intersection2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean hM[] = new boolean[1001];
        Arrays.fill(hM, false);
        Set<Integer> hs = new HashSet<>();
        int i;
        for(i = 0; i < nums1.length; i++){
            hM[nums1[i]] = true;
        }
        for(i = 0;i < nums2.length;i++){
            if(hM[nums2[i]] == true){
                hs.add(nums2[i]);
            }
        }
        int[] arr = new int[hs.size()];
        i = 0;
        for(int item : hs){
            arr[i] = item;
            i++;
        }
        return arr;
    }
}
