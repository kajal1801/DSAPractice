import java.util.Arrays;
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        int min;
        String small = "", high = "", ans = "";
        if(strs[0].length() <= strs[strs.length - 1].length()){
            min = strs[0].length();
            small = strs[0];
            high = strs[strs.length - 1];
        }
        else{
            min = strs[strs.length - 1].length();
            small = strs[strs.length - 1];
            high = strs[0];
        }
        for(int i = 0; i < min;i++){
            if(small.charAt(i) == high.charAt(i)){
                ans = ans + small.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}