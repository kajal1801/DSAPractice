import java.util.*;

class LeftmostRepeating1{
    public int leftmost(String s){
        int fi, res = Integer.MAX_VALUE;
        int index[] = new int[256];
        Arrays.fill(index, -1);
        for(int i = 0;i<s.length();i++){
            fi = index[s.charAt(i)];
            if(fi == -1){
                index[s.charAt(i)] = i;
            }
            else{
                res = Math.min(res, fi);
            }
        }
        if(res == Integer.MAX_VALUE){
            res = -1;
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