//Technique to only print one answer
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSumK2 {
    public boolean subsetsum(int arr[], int i, List<Integer> curr, int s, int sum){
        if(i == arr.length){
            if(s == sum){
                return true;
            }
            return false;
        }
        curr.add(arr[i]);
        s+=arr[i];
        if(subsetsum(arr, i+1, curr, s, sum) == true) 
            return true;
        curr.remove(curr.size() - 1);
        s-=arr[i];
        if(subsetsum(arr, i+1, curr, s, sum) == true)
            return true;
        return false;
    }

    public static void main(String args[]){
        SubsetSumK2 obj = new SubsetSumK2();
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
        List<Integer> curr = new ArrayList<Integer>();
        boolean f = obj.subsetsum(arr, 0, curr, 0, sum);
        if(f == true){
            System.out.println(curr);
        }
        else{
            System.out.println("No subsequences found");
        }
        System.out.println();
        sc.close();
    }
}
