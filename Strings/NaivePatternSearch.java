import java.util.Scanner;

public class NaivePatternSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            NPSearch obj = new NPSearch();
            
            if(obj.search(p, s) ==  true)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
        sc.close();
    }
}

class NPSearch
{
    public boolean search(String pat, String txt)
    {
            // Your code here
            int k = pat.length();
        	for(int i =0;i<txt.length() - k+1;i++){
        	    if(txt.substring(i,i+k).equals(pat)){
        	        return true;
        	    }
        	}
        	return false;
    }
    
}