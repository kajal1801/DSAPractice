public class SumOfLargeNumbers{
    String findSum(String X, String Y) {
        // code here
        String ans = "";
        int a = 0, carry = 0;
        int i = X.length() - 1, j = Y.length() - 1;
        while(i >= 0 && j >= 0){
            a = Character.getNumericValue(X.charAt(i)) + Character.getNumericValue(Y.charAt(j)) + carry;
            carry = a/10;
            a = a%10;
            ans = Integer.toString(a) + ans;
            i--;
            j--;
        }
        while(i >= 0){
            a = Character.getNumericValue(X.charAt(i)) + carry;
            carry = a/10;
            a = a%10;
            ans = Integer.toString(a) + ans;
            i--;
        }
        while(j >= 0){
            a = Character.getNumericValue(Y.charAt(j)) + carry;
            carry = a/10;
            a = a%10;
            ans = Integer.toString(a) + ans;
            j--;
        }
        ans = Integer.toString(carry) + ans;
        String res = ans;
        for(i = 0;i < ans.length()-1;i++){
            if(ans.charAt(i) == '0'){
                res = ans.substring(i+1);
            }
            else{
                break;
            }
        }
        return res;
    }
}