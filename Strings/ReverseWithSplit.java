public class ReverseWithSplit {
    //Function to reverse words in a given string.
    public static String reverseWords(String s)
    {
        // code here 
        String ans = "";
        String[] words = s.split(".");
        System.out.println(words.length);
        ans = words[0];
        for(int i = 1;i < words.length;i++){
            ans = words[i] + '.' + ans;
        }
        return ans;
    }
    public static void main(String args[]){
        String s = "i.like.you.so.much.you.never.know";
        System.out.println(reverseWords(s));
    }
}
