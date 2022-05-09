import java.util.Scanner;

public class MultipleRecursion {

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last+slast;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = fibonacci(n);
        System.out.println("The number at nth position in the fibonacci series is : "+ k);
        sc.close();
    }
}

// for every n we call the function twice 
// thus the time complexity is 2^n(exponential)