package Arrays;

import java.util.Scanner;

public class PairSum {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum to be found: ");
        int k = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j]) == k){
                    System.out.printf("Pairs at %d and %d(%d + %d) are equal to %d\n",i,j,arr[i],arr[j],k);
                }
            }
        }

        sc.close();
    }
}
