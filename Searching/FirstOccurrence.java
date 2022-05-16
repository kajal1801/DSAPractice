import java.util.Scanner;

public class FirstOccurrence {
    public int b_search(int arr[], int lb, int ub, int key){
        if(lb > ub){
            return -1;
        }
        int mid= lb + ((ub-lb)/2);
        if(arr[mid] > key){
            ub = mid-1;
            return b_search(arr,lb,ub,key);
        }
        else if(arr[mid] < key){
            lb = mid+1;
            return b_search(arr,lb,ub,key);
        }
        else if(mid != 0 && arr[mid] == arr[mid-1]){
            return b_search(arr, lb, mid-1, key);
        }
        return mid;
    }

    public static void main(String args[]){
        FirstOccurrence obj = new FirstOccurrence();
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
        int res = obj.b_search(arr, 0, n, k);
        if(res > -1){
            System.out.println("The given element was found at the index: " + res);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
