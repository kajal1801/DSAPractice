import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        String s = "Kajal Jaiswal";
        System.out.println("Original String : " + s);
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < s.length();i++){
            st.push(s.charAt(i));
        }
        s = "";
        while(!st.isEmpty()){
            s += st.pop();
        }
        System.out.println("Reversed String : " + s);
    }
}
