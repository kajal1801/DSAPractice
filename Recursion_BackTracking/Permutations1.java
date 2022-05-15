import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations1 {
    
    public static void recurPermutation(int arr[], List<Integer> curr, List<List<Integer>> result, boolean []freq){
        if(curr.size() == arr.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0;i<arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                curr.add(arr[i]);
                recurPermutation(arr, curr, result, freq);
                curr.remove(curr.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<>();
        boolean []freq = new boolean[arr.length];
        recurPermutation(arr, curr, list, freq);
        for (List<Integer> list2 : list) {
            System.out.println(list2);
        }
        sc.close();
    }
}

// T(n) = O(n! * n)
// S(n) = O(n) + O(n)
//Auxilliary Space = O(n) for recursion