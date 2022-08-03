import java.util.Arrays;

public class TripletSumII {
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       Arrays.sort(A);
       int l,r,i;
       int ans = 0;
       for(i = 0;i<n-2;i++){
           l = i+1;
           r = n-1;
           
           while(l < r){
               if(A[i]+A[l]+A[r] == X){
                   ans = 1;
                   break;
               }
               else if(A[i]+A[l]+A[r] < X){
                   l++;
               }
               else{
                   r--;
               }
           }
           
           if(ans == 1){
               break;
           }
       }
       if(ans == 1){
           return true;
       }
       return false;
    
    }
}
