import java.util.Scanner;

public class ArrayRotation {

    public static void leftrotate(int a[],int k,int n){
        while(k>0){
            int temp = a[0];
            for(int i = 0;i<n-1;i++){
                a[i] = a[i+1];
            }
            a[n-1] = temp;
            k--;
        }
    }

    public static void rightrotate(int a[],int k,int n){
        while(k>0){
            int temp = a[n-1];
            for(int i = n-1;i>0;i--){
                a[i] = a[i-1];
            }
            a[0] = temp;
            k--;
        }
    }
    
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 1 for left rotation\nEnter 2 for right rotation:");
        int choice = sc.nextInt();
        System.out.println("Enter the frequency of rotation: ");
        int k = sc.nextInt();
        switch(choice){
            case 1:
                leftrotate(a, k, n);
                break;
            case 2:
                rightrotate(a, k, n);
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("\nArray after rotation:");
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
