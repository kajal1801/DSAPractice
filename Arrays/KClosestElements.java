import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        int l = 0, r = arr.length - 1;
        while (r - l >= k) {
			if (Math.abs(x - arr[l]) <= Math.abs(x - arr[r]))
				r--;
			else
				l++;
		}
        for(int i = l; i <= r;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        return list;
    }
}
