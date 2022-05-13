import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum2 {
    public void sum(int i, int target, int arr[], List<Integer> curr, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int ind = i; ind < arr.length ;ind++){
            if(ind > i && arr[ind] == arr[ind-1]){
                continue;
            }
            if(arr[ind] > target){
                break;
            }
            curr.add(arr[ind]);
            sum(ind+1, target - arr[ind], arr, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String args[]){
        CombinationSum2 obj = new CombinationSum2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target you want check for: ");
        int target = sc.nextInt();
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<>();
        obj.sum(0, target, arr, curr, result);
        for(List<Integer> list : result){
            System.out.println(list);
        }
        sc.close();
    }

}

// T(n) = 2^n * k (average length of every combination)
// S(n) = k * x