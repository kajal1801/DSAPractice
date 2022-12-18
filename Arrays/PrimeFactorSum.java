// public class PrimeFactorSum {
//     public static int sumOfFactors(int n){
//         int sum = 0;
//         while(n % 2 == 0 && n != 0){
//             n /= 2;
//             sum += 2;
//         }
//         for (int i = 3; i <= Math.sqrt(n); i+= 2)
//         {
//             while (n%i == 0)
//             {
//                 n /= i;
//                 sum += i;
//             }
//         }
//         return sum;
//     }
//     public static boolean isPrime(int n){
//         if(n <= 3){
//             return true;
//         }
//         if(n % 2 == 0 || n % 3 == 0){
//             return false;
//         }
        
//         for(int i = 5;i*i <= n;i+=6){
//             if(n%i == 0 || n%(i+2)  == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static int smallestValue(int n) {
//         int ans = n;
//         if(isPrime(n)){
//             return n;
//         }
//         while(!isPrime(ans)){
//             ans = sumOfFactors(ans);
//             if(isPrime(ans)){
//                 break;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int n = 15;
//         System.out.println(smallestValue(n));
//     }
// }

// Program to print all prime factors
import java.lang.Math;

class PrimeFactorSum
{
	// A function to print all prime factors
	// of a given number n
	public static int primeFactors(int n)
	{
        int sum = 0;
		// Print the number of 2s that divide n
		while (n%2==0)
		{
			sum += 2;
			n /= 2;
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for (int i = 3; i*i <= n; i+= 2)
		{
			// While i divides n, print i and divide n
			while (n%i == 0)
			{
				sum += i; 
				n /= i;
			}
		}
        if(n > 2 && isPrime(n)){
            sum += n;
            return sum;
        }
		// This condition is to handle the case when
		// n is a prime number greater than 2
		return sum;
	}

    public static boolean isPrime(int n){
        if(n <= 3){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        
        for(int i = 5;i*i <= n;i+=6){
            if(n%i == 0 || n%(i+2)  == 0){
                return false;
            }
        }
        return true;
    }

	public static void main (String[] args)
	{
		int n = 8;
		System.out.println(primeFactors(n)); 
	}
}
