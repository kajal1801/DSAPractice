class PlusOne {
    public int[] plusOne(int[] digits) {
        int c = 1,p = digits.length - 1;
        while(c != 0 && p > -1){
            if(digits[p] == 9){
                digits[p] = 0;
                p--;
            }
            else{
                digits[p] += 1;
                c--;
            }
        }
        if(c == 1){
            int[] ans = new int[digits.length + 1];
            ans[++p] = 1;
            return ans;
        }
        return digits;
    } 
}
