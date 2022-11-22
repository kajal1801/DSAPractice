public class StringtoInteger {
    public int myAtoi(String s) {
        s = s.trim();
        int ans = 0;
        int i = 0;
        boolean isPos = true, isValid = false;
        if(s.contains("+-")||s.contains("-+")) 
            return 0;
        
        for(;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || (c == ' ' && isValid) || (c == '.')){
                    break;
            }
            if(isValid && (c == '+' || c == '-')){
                break;
            }
            if(c == '+' || c == '-'){
                isValid = true;
            }
            if(Character.isDigit(c)){
                isValid = true;
                int x = s.charAt(i) - '0';
                if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && x>7)){
                    return isPos?Integer.MAX_VALUE:-Integer.MAX_VALUE-1;
                }
                                        
                    ans = ans*10 + (int)(c - '0');
                
            }
            if(c == '-'){
                isPos = false;;
            }
        }
        return isPos ? ans : -1*ans;
    }
}
