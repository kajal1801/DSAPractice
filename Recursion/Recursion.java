/* Recursion - When a function calls itself, until a spcified condition is met.
*/
/* 
Stackoverflow occurs when we do not give a base case and the function call goes on infinitely.
*/
/**
 * The condition we use to stop a recursive function is called base case.
 */

public class Recursion {

    public static void f1(int n){
        if(n == 0){
            return;
        }
        System.out.println("Hello "+n);
        f1(--n);
    }
    public static void main(String args[]){
        f1(10);
    }
}

