public class LargestOddNumber {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1;i >= 0;i--){
            char c = num.charAt(i);
            if((c - '0') % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
