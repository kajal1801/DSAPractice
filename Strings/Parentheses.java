import java.util.Stack;

class Parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }
            else if(c == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }
            else if(c == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}