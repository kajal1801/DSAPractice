// Strings

import java.util.*;
import java.io.*;
public class PowerSet
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Bits ob = new Bits();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

class Bits
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String> list = new ArrayList<String>();
        int n = s.length();
        for(int i = 0;i<(1 << n);i++){
            String subset = "";
            for(int j = 0;j<n;j++){
                if((i&(1<<j)) != 0){
                    subset += s.charAt(j);
                }
            }
            if(subset.length() > 0)
                list.add(subset);
        }
        Collections.sort(list);
        return list;
    }
}