import java.util.Scanner;

public class SearchGreater{
    public int search(int arr[], int key){
        if(arr[arr.length - 1] <= key){
            return key;
        }
        if(arr[0] > key){
            return arr[0];
        }
        int ans = -1, low = 0, high = arr.length -1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(arr[mid] <= key){
                low = mid + 1;
            }
            else{
                ans = arr[mid];
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        SearchGreater obj = new SearchGreater();
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
        System.out.println("The next greater element is: " + res);
        
        sc.close();
    }
}