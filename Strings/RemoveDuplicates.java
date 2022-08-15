import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    String removeDuplicates(String str) {
        // code here
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        String ans = "";
        for(int i = 0;i < str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                ans = ans + str.charAt(i);
                map.put(str.charAt(i), 1);
            }
        }
        return ans;
    }
}