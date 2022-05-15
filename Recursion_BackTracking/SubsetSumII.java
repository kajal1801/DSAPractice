import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Brute force...
/**
 * Perform Subset I solution then, store the List into a Set then again store the Set into in List
 */
public class SubsetSumII {
    public static void findSubset(int ind, int[] arr, List<Integer> curr, List<List<Integer>> result){
        result.add(new ArrayList<>(curr));
        for(int i = ind; i < arr.length;i++){
            if(i!=ind && arr[i] == arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            findSubset(i+1, arr, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the aize of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<>();
        findSubset(0, arr, curr, list);
        for (List<Integer> list2 : list) {
            System.out.println(list2);
        }
        sc.close();
    }
}

// T(n) = O(n * 2^n)
// 2^n for recursion and n for storing it in another list
// S(n) = O(2^n) * O(k)
// Auxilliary Space = O(n)