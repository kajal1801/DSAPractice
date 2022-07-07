// Not All Correct yet

import java.util.ArrayList;
import java.util.Scanner;

public class BrainGames
{
    public static boolean isprime(int n)
    {
        if(n == 1 || n == 0)
        {
            return false;
        }
        if(n == 2 || n == 3)
        {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }
        for(int i = 5; i < n;i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean bgames(int arr[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count_np = 0, j = 0, ans = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            if(isprime(arr[i]) == false)
            {
                count_np++;
                list.add(arr[i]);
                System.out.println(arr[i]);
            }
        }
        ans = count_np;
        if(ans == 0)
        {
            return false;
        }
        while(count_np != 0 && j < list.size())
        {
            int n = list.get(j);
            for(int i = n-1;i>=2;i--)
            {
                if(n % i == 0){
                    if(isprime(i) == false)
                    {
                        count_np++;
                        list.add(i);
                        System.out.println(i);
                        ans++;
                    }
                    else
                    {
                        count_np--;
                    }
                }
            }
            j++;
        }
        if(count_np != 0){
            ans += count_np;
        }
        if(ans % 2 == 0){
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean result = bgames(arr);
        if(result == true)
        {
            System.out.println("The winner is A");
        }
        else
        {
            System.out.println("The winner is B");
        }
        sc.close();
    }
}