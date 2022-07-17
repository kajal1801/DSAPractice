import java.util.Scanner;

public class isSequences {
    public static boolean isSubsequence(String s, String t) {
        int index = 0;
        if(s.length() == 0){
            return true;
        }
        for(int num = 0;num < t.length();num++){
            if(index >= s.length()){
                break;
            }
            if(s.charAt(index) == t.charAt(num)){
                index++;
            }
        }
        if(index == s.length()){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subsequence: ");
        String s = sc.nextLine();
        System.out.println("Enter the original String: ");
        String t = sc.nextLine();
        if(isSubsequence(s, t)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}