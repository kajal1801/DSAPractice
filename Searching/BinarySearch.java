import java.util.Scanner;

public class BinarySearch{
    int binarysearch(int arr[], int n, int k) {
        int start = 0, end = n-1, ans = -1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] > k){
                end = mid-1;
            }
            else if(arr[mid] < k){
                start = mid+1;
            }
            else if(arr[mid] == k){
                ans = mid;
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        BinarySearch obj = new BinarySearch();
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
        int res = obj.binarysearch(arr, n, k);
        if(res > -1){
            System.out.println("The given element was found at the index: " + res);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}