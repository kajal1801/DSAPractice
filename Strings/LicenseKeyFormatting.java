public class LicenseKeyFormatting{
    static String ReFormatString(String S, int K){
        // code here
        String ans = S.toUpperCase();
        int p = 0;
        ans = ans.replaceAll("-","");
        StringBuilder sb = new StringBuilder();
        for(int i = ans.length() - 1;i>=0;i--){
            if(p == K){
                sb.append("-");
                p = 0;
                sb.append(ans.charAt(i));
                p++;
            }
            else{
                sb.append(ans.charAt(i));
                p++;
            }
        }
        ans = sb.reverse().toString();
        return ans;
    } 
}