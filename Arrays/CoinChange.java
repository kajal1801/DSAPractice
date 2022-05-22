import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public int cChange(int[] coins, int amount, int n) {
        int count = 0;
        Arrays.sort(coins);
        int j = n - 1;
        while(amount >= 0 && j>=0){
            if(amount == 0){
                return count;
            }
            else if(coins[j] <= amount){
                amount -= coins[j];
                count++;
            }
            else{
                j--;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        CoinChange obj = new CoinChange();
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int coins[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        int k = obj.cChange(coins, amount, n);
        System.out.println("Answer : "+k);
        sc.close();
    }
}
