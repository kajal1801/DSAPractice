import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingOptimal {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, result = 0;
        Set<Character> hashSet = new HashSet<Character>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            while(start < i && hashSet.contains(c)){
                hashSet.remove(s.charAt(start));
                start++;
            }
            result = Math.max(result, i - start + 1);
            hashSet.add(c);
        }
        return result;
    }
}
