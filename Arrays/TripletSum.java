import java.util.Scanner;

public class TripletSum {

    public static void triple(int a[],int n,int sum){
        for(int i = 0;i<n-2;i++){
            for(int j =i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(a[i]+a[j]+a[k] == sum){
                        System.out.printf("The indexes of the numbers whose sum is equal to the givem sum is: %d, %d, %d ", a[i],a[j],a[k]);
                        return;
                    }
                }
            }
        }
        System.out.println("No such triplets found");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemetns of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum to be evaluated: ");
        int sum = sc.nextInt();

        triple(arr,n,sum);
        sc.close();

    }
}
