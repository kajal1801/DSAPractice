import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSumK {
    public void subsetsum(int arr[], int i, List<Integer> curr, List<List<Integer>> result, int s, int sum){
        if(i == arr.length){
            if(s == sum){
                result.add(new ArrayList<Integer>(curr));
            }
            return;
        }
        curr.add(arr[i]);
        s+=arr[i];
        subsetsum(arr, i+1, curr, result, s, sum);
        curr.remove(curr.size() - 1);
        s-=arr[i];
        subsetsum(arr, i+1, curr, result, s, sum);
    }

    public static void main(String args[]){
        SubsetSumK obj = new SubsetSumK();
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
        List<List<Integer>> result = new ArrayList<>();
        obj.subsetsum(arr, 0, curr, result, 0, sum);
        for (List<Integer> list : result) {
            System.out.print(list + " ");
        }
        System.out.println();
        sc.close();
    }
}
