import java.util.Scanner;

public class SwapArray {
    static int arr[];
    static int n;

    public static void swap(int arr[], int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    public static void f(int i){
        if(i>=n/2){
            return; 
        }
        swap(arr,i , n-i-1);
        f(i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        f(0);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " " );
        }
        sc.close();
    }
}
