import java.util.*;

public class LeftmostRepeating2 {
    public int leftmost(String s){
        int res = -1;
        boolean index[] = new boolean[256];
        for(int i = s.length() - 1;i>=0;i--){
            if(index[s.charAt(i)] == true){
                res = i;
            }
            else{
                index[s.charAt(i)] = true;
            }
        }
        return res;
    }

    public static void main(String args[]){
        LeftmostRepeating1 obj = new LeftmostRepeating1();
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        int k = obj.leftmost(s);
        System.out.println(k);
        sc.close();
    }
}
