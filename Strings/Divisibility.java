public class Divisibility {
    int isdivisible7(String num){
        // code here
        int remainder = 0;
        for(int i = 0;i < num.length();i++){
            int digit = remainder * 10 + (num.charAt(i) - '0');
            remainder = digit % 7;
        }
        if(remainder == 0){
            return 1;
        }
        return 0;
    }
}