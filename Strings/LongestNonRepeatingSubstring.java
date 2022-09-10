import java.util.ArrayList;

public class LongestNonRepeatingSubstring {
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int f = 0;
        int t=0;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            
            char ch = s.charAt(i);
            
            if ( arr.contains(ch) ) {
                i-=t-arr.indexOf(ch);
                
                if ( f <t )
                    f = t;
                t=0;
                arr.clear();
            }
            else {
                t++;
                arr.add(ch);
            }
                
        }
        if(t>f)
            return t;
        return f;
    }
    public static void main(String args[]){
        String str = "pwwkew";
        int ans = lengthOfLongestSubstring(str);
        System.out.println(ans);
    }
}