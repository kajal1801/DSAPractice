import java.util.Scanner;

public class SubsequenceSearch1 {
    public boolean ss1(String s1, String s2){
        if(s2 == ""){
            return true;
        }
        int i = 0, j =0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j == s2.length()){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String:");
        String s2 = sc.nextLine();
        SubsequenceSearch1 obj = new SubsequenceSearch1();
        if(obj.ss1(s1, s2)){
            System.out.println("The string " + s2 + " is a subsequence of the string " + s1);
        }
        else{
            System.out.println("The string " + s2 + " is not a subsequence of the string " + s1);
        }
        sc.close();
    }
}
