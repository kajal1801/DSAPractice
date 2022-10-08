import java.util.Arrays;

public class KUniqueStrings {
    public int solve(String s, int k) {
        int count = 0;
        int[] hashMap = new int[26];

        for(int i = 0;i < s.length();i++){
            hashMap[s.charAt(i) - 'a']++;
            if(hashMap[s.charAt(i) - 'a'] == 1){
                count++;
            }
        }
        int minValue = 0;
        if(count <= k){
            return 0;
        }
        int j = 26 - count;
        Arrays.sort(hashMap);
        for(int i = j;i < 26;i++){
            if(count > k){
                minValue += hashMap[i];
                count--;
            }
        }
        return minValue;
    }
}
