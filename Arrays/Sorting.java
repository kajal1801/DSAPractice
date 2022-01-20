package Arrays;

import java.util.Scanner;

public class Sorting{
    private int n;
    private int A[];

    Sorting(){
        n = 0;      
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        A = new int[n];
        System.out.println("Enter the valus of the array: ");
        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }
        sc.close();
    }

    public void selectionsort(){
        System.out.println("Array before sorting: ");
        printarray(A);
        System.out.println("Array after sorting: ");
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(A[min]>A[j]){
                    min = j;
                }
            }
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
        printarray(A);
    }
    
    public void printarray(int arr[]){
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Sorting ob = new Sorting();
        ob.input();
        ob.selectionsort();
    }
}