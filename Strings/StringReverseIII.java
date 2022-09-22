public class StringReverseIII{
    public String reverseWords(String s) {
        if(s.length() <= 1){
            return s;
        }
        String res = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else{
                res = res + sb.reverse().toString() + " ";
                sb.setLength(0);
            }
        }
        res = res + sb.reverse().toString() + " ";
        res = res.trim();
        return res;
    }
}