package Arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void reversearr(int arr[],int n){
        int start = 0,end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reversearr(arr, n);
        System.out.println("Array after reversing: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
