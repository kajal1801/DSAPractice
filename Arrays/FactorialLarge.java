import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialLarge {
    public static void main(String[] args){
        //code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N = sc.nextInt();
        int carry = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = N;
        while(m != 0){
            list.add(m%10);
            m/=10;
        }
        N -= 1;
        while(N > 1){
            int size = list.size();
            for(int i = 0; i < size;i++){
                int temp = (list.get(i)*N) + carry;
                list.set(i,temp%10);
                carry = temp/10;
            }
            while(carry != 0){
                list.add(carry%10);
                carry/=10;
            }
            N--;
        }
        Collections.reverse(list);
        System.out.println(list);
        sc.close();
    }
}