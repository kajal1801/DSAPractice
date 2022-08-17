public class CountnSay {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        if(n == 2){
            return "11";
        }
        String s = "11";
        for(int i = 3;i <= n;i++){
            int count = 1;
            String ans = "";
            s = s + "&";
            for(int j = 1;j < s.length();j++){
                if(s.charAt(j) == s.charAt(j-1)){
                    count++;
                }
                else{
                    ans = ans + (Integer.toString(count) + s.charAt(j-1));
                    count = 1;
                }
            }
            s = ans; 
        }
        return s;
    }
}
