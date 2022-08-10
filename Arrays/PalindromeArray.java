import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n-1, count = 0;
        while(i <= j){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }
            else if(arr[i] > arr[j]){
                arr[j-1] = arr[j] + arr[j-1];
                j--;
                count++;
            }
            else{
                arr[i+1] = arr[i] + arr[i+1];
                i++;
                count++;
            }
        }
        System.out.println("The Number of merge operations are: " + count);
        sc.close();
    }
}
