import java.util.Scanner;

public class Count1s {
    public int count(int arr[], int lb, int ub){
        int mid = lb + ((ub - lb)/2);
        if(arr[arr.length - 1] == 0){
            return 0;
        }
        else if(arr[mid] == 0){
            lb = mid + 1;
            return count(arr, lb, ub);
        }
        else if(mid != 0 && arr[mid-1] == 1){
            ub = mid - 1;
            return count(arr, lb, ub);
        }
        return (arr.length - mid);
    }

    public static void main(String args[]){
        Count1s obj = new Count1s();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = obj.count(arr, 0, n);
        if(res != 0){
            System.out.println("The count of the given element is: " + res);
        }
        else{
            System.out.println("1 is not present in the given binary array");
        }
        sc.close();
    }
}
