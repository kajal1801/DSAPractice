import java.util.Scanner;

public class UnboundedBS {

    public int binarysearch(int arr[], int lb, int ub, int key){
        if(lb > ub){
            return -1;
        }
        int mid = lb + ((ub - lb)/2);
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] > key){
            return binarysearch(arr, lb, mid-1, key);
        }
        else{
            return binarysearch(arr, mid+1, ub, key);
        }
    }

    public int search(int arr[], int key){
        if(arr[0] == key){
            return 0;
        }
        int i = 1;
        while(arr[i] < key){
            i*=2;
        }
        if(arr[i] == key){
            return i;
        }
        return binarysearch(arr, 0, arr.length, key);
    }

    public static void main(String args[]){
        UnboundedBS obj = new UnboundedBS();
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
        int res = obj.search(arr, k);
        if(res > -1){
            System.out.println("The given element was found at the index: " + res);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
