import java.util.Scanner;

public class SquareRoot {
    
    public int root(int n,int low, int high){
        int ans = -1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            int msq = mid*mid;
            if(msq == n){
                return mid;
            }
            else if(msq > n){
                high = mid - 1;
                
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        SquareRoot obj = new SquareRoot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int res = obj.root(n, 0 , n);
        System.out.println("The square root of the given element is: " + res);
        sc.close();
    }
}
