import java.util.Scanner;

public class MajorityElement{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0,res=0,num = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    max++;
                }
            }
            if(max>res){
                res = max;
                num = arr[i];
            }
        }
        System.out.println(num);
        sc.close();
    }
}