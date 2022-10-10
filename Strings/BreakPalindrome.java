public class BreakPalindrome {
    public static void main(String args[]) {
        String palindrome = "aba";
        String s1 = "";
        int n = palindrome.length();
        
        if(n < 2){
            System.out.println("");
        }
        
        int i = 0;
        while(i < n){
            if(palindrome.charAt(i) != 'a'){
                s1 = palindrome.substring(0,i) + 'a' + palindrome.substring(i+1);
                System.out.println(s1);
            }
            i++;
        }
        
        s1 = palindrome.substring(0,n-1) + 'b';
        System.out.println(s1);
    }   
}