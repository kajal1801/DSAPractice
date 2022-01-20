package Arrays;

import java.util.Scanner;

public class SubarraySum {
    public static void main(String ars[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = arr[0], res = arr[0];
        for(int i=1;i<n;i++){
            sum = Math.max(arr[i],arr[i]+sum);
            res = Math.max(sum,res);
        }

        System.out.println("The larget continuous subarray sum is: "+res);
        sc.close();
    }
}
