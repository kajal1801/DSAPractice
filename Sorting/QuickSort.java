import java.util.Scanner;

public class QuickSort{
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int partition(int arr[], int l, int h){
        int pivot = arr[h], i = l - 1, j;
        for(j = l; j < h; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1,h);
        return i+1;
    }

    public void quick_sort(int arr[], int l, int h){
        if(l < h){
            int p = partition(arr, l, h);
            quick_sort(arr,l,p-1);
            quick_sort(arr,p+1,h);
        }
    }

    public static void main(String args[]){
        QuickSort obj = new QuickSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the unsorted array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.quick_sort(arr, 0, n-1);
        System.out.println("Sorted Array:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}