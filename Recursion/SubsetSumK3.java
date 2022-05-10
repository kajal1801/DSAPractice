import java.util.Scanner;

public class SubsetSumK3 {
    public int subsetsum(int arr[], int i, int s, int sum){
        if(s > sum){
            return 0;
        }
        if(i == arr.length){
            if(s == sum){
                return 1;
            }
            return 0;
        }
    
        s+=arr[i];
        int lt = subsetsum(arr, i+1, s, sum);
        s-=arr[i];
        int rt = subsetsum(arr, i+1, s, sum);
        return lt+rt;
    }

    public static void main(String args[]){
        SubsetSumK3 obj = new SubsetSumK3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum you want check for: ");
        int sum = sc.nextInt();
        int ans = obj.subsetsum(arr, 0, 0, sum);
        System.out.println("The number of Subsets with sum " + sum + " is " + ans);
        sc.close();
    }
}

// Time Complexity: O(2^n)
