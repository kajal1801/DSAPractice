import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations2 {
    public void permute(int i, int arr[], List<List<Integer>> ans){
        if(i == arr.length){
            List<Integer> curr = new ArrayList<Integer>();
            for(int index = 0;index<arr.length;index++){
                curr.add(arr[index]);
            }
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int index = i;index<arr.length;index++){
            swap(arr,i, index);
            permute(i+1, arr, ans);
            swap(arr, i, index);
        }
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){
        Permutations2  obj = new Permutations2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        obj.permute(0, arr, list);
        for (List<Integer> list2 : list) {
            System.out.println(list2);
        }
        sc.close();
    }
}

