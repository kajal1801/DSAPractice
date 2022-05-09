import java.util.Scanner;

public class PalindromeString {
    static String s;
    static int n;
    public static boolean palin(int i){
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return palin(i+1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        n = s.length();
        boolean k = palin(0);
        if(k){
            System.out.println("Palindromic String");
        }
        else{
            System.out.println("Not Palindromic String");
        }
        sc.close();
    }

}
