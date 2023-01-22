import java.util.ArrayList;

public class ClosestStrings {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int pos1 = -1, pos2 = -1, res = Integer.MAX_VALUE;
        for(int i = 0;i < s.size();i++){
            if(s.get(i).equals(word1)){
                pos1 = i;
            }
            if(s.get(i).equals(word2)){
                pos2 = i;
            }
            if(pos1 != -1 && pos2 != -1)
                res = Math.min(res, Math.abs(pos1 - pos2));
        }
        return res;
    }
}
