import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerEle2 {
    public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        for(int i = n-1;i >=0;i--){
            int curr = arr.get(i);
            while(st.peek() >= curr){
                st.pop();
            }
            list.add(st.peek());
            st.push(curr);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = nextSmallerElement(arr, arr.size());
        for (Integer integer : list) {
            System.out.println(integer + " ");
        }
    }
}
