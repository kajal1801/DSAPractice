public class RemoveParenthesis {
    public String removeOuterParentheses(String s) {
        int open = 0, close = 0,n = s.length();
        String res = "", temp = "";
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '('){
                open++;
                temp += '(';
            }
            else if(s.charAt(i) == ')'){
                close++;
                temp += ')';
            }
            if(open == close){
                res += temp.substring(1, temp.length() - 1);
                temp = "";
            }
        }
        return res;
    }
}
