import java.util.Scanner;

public class SumN1{
    public static void sum(int i, int s){
        if(i < 1){
            System.out.println("Sum = "+s);
            return;
        }
        sum(i-1, s+i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n,0);
        sc.close();
    }
}