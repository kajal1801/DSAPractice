import java.util.*;

class RemoveAnagram {
    
    public boolean areAnagrams(String str1, String str2)
    {
        int count[] = new int[256];
        int n1 = str1.length();
        int n2 = str2.length();
        int i;

        for (i = 0; i < n1 && i < n2; i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        if (n1 != n2)
          return false;

        for (i = 0; i < 256; i++)
            if (count[i] != 0)
                return false;
         return true;
    }
    
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<String>();
        list.add(words[0]);
        for(int i = 1;i<words.length;i++){
            boolean k = areAnagrams(words[i] , words[i-1]);
            if(!k){
                list.add(words[i]);
            }
        }
        return list;
    }
}