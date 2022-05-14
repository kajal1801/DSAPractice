import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// A contiguous/non-contiguous sequence, which follows the order of the array

public class Subsequences{

    public static void printing(int arr[], int ind, List<Integer> curr, List<List<Integer>> list){
        if(ind == arr.length){
            list.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(arr[ind]);
        printing(arr, ind+1, curr, list);
        curr.remove(curr.size() - 1);
        printing(arr, ind+1,curr, list);
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
        printing(arr, 0, curr, list);
        for (List<Integer> list2 : list) {
            System.out.println(list2);
        }
        sc.close();
    }
}