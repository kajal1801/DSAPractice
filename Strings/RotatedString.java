public class RotatedString {
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        String s = "";
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0;i < s1.length();i++){
            s = s1.substring(i,s1.length()) + s1.substring(0, i);
            if(s.equals(s2)){
                return true;
            }
        }
        return false;
    }
    
}