package Arrays;

import java.util.Scanner;

public class SegregateOne {

    public static void seggragate(int arr[], int n){
        int start = 0, end = n-1;
        while(start<end){
            if(arr[start] == 1){
                if(arr[end] == 0){
                    arr[start] = 0;
                    arr[end] = 1;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
                start++;
            }
        }
    }

    public static void printarray(int arr[],int n){
        System.out.println("Array after seggregation: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
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

        seggragate(arr, n);
        printarray(arr, n);

        sc.close();

    }
}
