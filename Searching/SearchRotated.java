import java.util.Scanner;

public class SearchRotated {

    public int search(int arr[], int key, int lb, int ub){
        if(lb > ub){
            return -1;
        }
        int mid = lb + ((ub-lb)/2);
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] > arr[0] && arr[0] < key){
            return search(arr, key, lb, mid-1);
        }
        return search(arr, key, mid+1, ub);
    }

    public static void main(String args[]){
        SearchRotated obj = new SearchRotated();
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
        int res = obj.search(arr, k, 0, n-1);
        if(res > -1){
            System.out.println("The given element was found at the index: " + res);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
