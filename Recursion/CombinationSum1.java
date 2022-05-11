import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum1 {
    public void sum(int i, int target, int arr[], List<Integer> curr, List<List<Integer>> result){
        if(i == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(curr));
            }
            return;
        }

        if(arr[i] <= target){
            curr.add(arr[i]);
            sum(i, target - arr[i], arr, curr, result);
            curr.remove(curr.size() - 1);
        }
        sum(i+1, target, arr, curr, result);
    }

    public static void main(String args[]){
        CombinationSum1 obj = new CombinationSum1();
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

// T(n) = 2^t * k
// S(n) = k*x