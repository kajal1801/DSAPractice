import java.util.Stack;

public class RemoveStarsFromStrings {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        s = "";
        while(!st.isEmpty()){
            s = st.pop() + s;
        }
        return s;
    }
}
