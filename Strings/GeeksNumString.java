import java.util.Stack;

public class GeeksNumString {
    public static int size(String s, int n){
        Stack<Integer> st = new Stack<>();
        int mem[] = {9, 2, 1, 4, 3, 6, 5, 8, 7, 0};
        for(char ch : s.toCharArray())
        {
            int x = ch-'0';
            
            if(!st.isEmpty() && mem[st.peek()]==x)
            {
                st.pop();
            }
            else
            {
                st.push(x);
            }
        }
        
        return st.size();
    }
}
