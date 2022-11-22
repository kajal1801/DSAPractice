/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WareHouse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int arr[][] = new int[n][2];
		    for(int i = 0;i < n;i++){
		        arr[i][0] = sc.nextInt();
		        arr[i][1] = sc.nextInt();
		    }
		    int vis[] = new int[n+1];
		    for(int i = 0;i<n;i++){
		        vis[arr[i][1]] = 1;
		    }
		    int count = 0;
		    for(int i = 0;i < n;i++){
		        if(vis[arr[i][0]] == 0){
		            count++;
                    vis[arr[i][0]] = 1;
		        }
		    }
		    System.out.println(count);
		}
		
	}
}
