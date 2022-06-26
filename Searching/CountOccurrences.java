import java.util.Scanner;

public class CountOccurrences {
    public int firstOccur(int arr[], int lb, int ub, int key){
        if(lb > ub){
            return -1;
        }
        int mid= lb + ((ub-lb)/2);
        if(arr[mid] > key){
            ub = mid-1;
            return firstOccur(arr,lb,ub,key);
        }
        else if(arr[mid] < key){
            lb = mid+1;
            return firstOccur(arr,lb,ub,key);
        }
        else if(mid != 0 && arr[mid] == arr[mid-1]){
            return firstOccur(arr, lb, mid-1, key);
        }
        return mid;
    }

    public int lastOccur(int arr[], int lb, int ub, int key){
        if(lb > ub){
            return -1;
        }
        int mid= lb + ((ub-lb)/2);
        if(arr[mid] > key){
            ub = mid-1;
            return lastOccur(arr,lb,ub,key);
        }
        else if(arr[mid] < key){
            lb = mid+1;
            return lastOccur(arr,lb,ub,key);
        }
        else if(mid != arr.length-1 && arr[mid] == arr[mid+1]){
            return lastOccur(arr, mid+1, ub, key);
        }
        return mid;
    }

    public int countOccur(int arr[], int lb, int ub, int key){
        int first = firstOccur(arr, lb, ub, key);
        if(first == -1){
            return 0;
        }
        int last = lastOccur(arr, lb, ub, key);
        return (last+first) - 1;
    }

    public static void main(String args[]){
        CountOccurrences obj = new CountOccurrences();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k = sc.nextInt();
        int res = obj.countOccur(arr, 0, n, k);
        if(res > -1){
            System.out.println("The count of the given element is: " + res);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
