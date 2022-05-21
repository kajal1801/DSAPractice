import java.util.*;

class LeftmostNonRepeating1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 0;i< s.length();i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
            }
            else{
                h.put(s.charAt(i), 1);
            }
        }
        int ans = -1;
        for(int i = 0;i<s.length();i++){
            if(h.get(s.charAt(i)) == 1){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}