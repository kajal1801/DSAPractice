import java.util.Scanner;

public class SearchInsert {
    public int getInsert(int arr[], int key){
        if(arr[0] >= key){
            return 0;
        }
        int lb = 1, ub = arr.length -1, ans = -1;
        while(lb <= ub){
            int mid = lb + ((ub-lb)/2);
            if(arr[mid] == key){
                ans = mid;
                break;
            }
            else if(arr[mid] < key){
                lb = mid+1;
            }
            else{
                ub = mid -1;
            }
        }
        if(ans == -1){
            ans = lb;
        }
        return ans;
    }

    public static void main(String args[]){
        SearchInsert obj = new SearchInsert();
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
        int res = obj.getInsert(arr, k);
        if(res > -1){
            System.out.println("The given element was found at the index: " + res);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
