package Arrays;

import java.util.Scanner;

public class ReorderArray{

    public static void selectionsort(int[] arr,int[] index,int n){
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i;j<n;j++){
                if(index[j]<index[min]){
                    min = j;
                }
            }
            int temp1 = index[min];
            int temp2 = arr[min];
            arr[min] = arr[i];
            index[min] = index[i];
            index[i] = temp1;
            arr[i] = temp2;
        }
    }

    public static void printarray(int arr[], int index[],int n){
        System.out.println("Array after reordering: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print(index[i]+" ");
        }
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the indexes: ");
        int index[] = new int[n];
        for(int i = 0;i<n;i++){
            index[i] = sc.nextInt();
        }

        selectionsort(arr,index,n);
        printarray(arr, index, n);

        sc.close();

    }
}
