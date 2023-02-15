import java.util.ArrayList;
import java.util.List;

public class AddArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        int n = num.length - 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(k != 0 && n >= 0){
            int a = k % 10;
            int sum = a + num[n] + carry;
            list.add(0, sum % 10);
            carry = sum / 10;
            n--;
            k = k / 10;
        }
        while(k != 0){
            int a = k % 10;
            int sum = a + carry;
            list.add(0, sum % 10);
            carry = sum / 10;
            k = k / 10;
        }
        while(n >= 0){
            int sum = num[n] + carry;
            list.add(0, sum % 10);
            carry = sum / 10;
            n--;
        }
        while(carry != 0){
            list.add(0, carry % 10);
            carry /= 10;
        }
        return list;
    }
}
