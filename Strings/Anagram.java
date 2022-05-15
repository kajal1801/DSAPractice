import java.util.Scanner;

public class Anagram {
    
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int[] count = new int[256];
         
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i = 0;i<256;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String:");
        String s2 = sc.nextLine();
        Anagram obj = new Anagram();
        if(obj.isAnagram(s1, s2)){
            System.out.println("The string " + s2 + " is an anagram of the string " + s1);
        }
        else{
            System.out.println("The string " + s2 + " is not an anagram of the string " + s1);
        }
        sc.close();
    }
}
