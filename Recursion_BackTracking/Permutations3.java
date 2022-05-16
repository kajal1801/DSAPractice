import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutations3 {
    public void permute(int i, int arr[], List<Integer> curr, boolean vis[], List<List<Integer>> ans){
        if(i == arr.length){
            return;
        }
        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int index = 0;index<arr.length;index++){
            if(vis[index]){
                continue;
            }
            vis[index] = true;
            curr.add(arr[index]);
            permute(index, arr, curr, vis, ans);
            curr.remove(curr.size() - 1);
            vis[index] = false;
            while(index+1 < arr.length && arr[index] == arr[index+1]){
                index++;
            }
        }
    }

    public static void main(String args[]){
        Permutations3  obj = new Permutations3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        obj.permute(0, arr, new ArrayList<>(), new boolean[arr.length], list);
        int i = 0;
        for (List<Integer> list2 : list) {
            System.out.println(list2);
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}
