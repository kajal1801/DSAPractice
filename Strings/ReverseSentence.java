public class ReverseSentence {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        int n = str.length;
        String ans = "";
        for(int i = 0;i < n;i++){
            if(str[i] != " ")
                ans = str[i] + " " + ans;
        }
        ans = ans.trim();
        return ans;
    }
}

/* Another Way */

/*
    class Solution {
    public String reverseWords(String s) {
        String temp = "", ans = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                temp = temp + s.charAt(i);
            }
            else{
                if(temp != "")
                    ans = temp + " " + ans;
                temp = "";
            }
        }
        if(temp != ""){
            ans = temp + " " + ans;
        }
        ans = ans.trim();
        return ans;
    }
}
*/