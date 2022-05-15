import java.util.Scanner;

public class SubsequenceSearch2 {
    
    public boolean ss2(String s1, String s2, int m, int n){
        if(n == 0){
            return true;
        }
        if(m == 0){
            return false;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return ss2(s1, s2, m-1, n-1);
        }
        return ss2(s1, s2, m-1, n);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String:");
        String s2 = sc.nextLine();
        SubsequenceSearch2 obj = new SubsequenceSearch2();
        if(obj.ss2(s1, s2, s1.length(), s2.length())){
            System.out.println("The string " + s2 + " is a subsequence of the string " + s1);
        }
        else{
            System.out.println("The string " + s2 + " is not a subsequence of the string " + s1);
        }
        sc.close();
    }
}
