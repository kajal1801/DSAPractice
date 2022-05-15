import java.util.Scanner;

public class Palindrome {
    public boolean palin(String s){
        int begin = 0, end = s.length() - 1;
        while(begin < end){
            if(s.charAt(begin) != s.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String in either UpperCase or LowerCase (Do Not mix the cases):");
        String s = sc.nextLine();
        Palindrome obj = new Palindrome();
        if(obj.palin(s)){
            System.out.println("The given string is Palindromic");
        }
        else{
            System.out.println("The given string is Not Palindromic");
        }
        sc.close();
    }
}
