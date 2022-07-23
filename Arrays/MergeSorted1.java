import java.io.*;

public class MergeSorted1
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Merging ob = new Merging();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Merging
{
    //Function to merge the arrays.
    public void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        for(int i = 0;i < n;i++){
            if(arr1[i] > arr2[0]){
                long temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                
                long first = arr2[0];
                int k;
                for(k = 1;k < m && arr2[k] <first;k++){
                    arr2[k-1] = arr2[k];
                }
                arr2[k-1] = first;
            }
        }
    }
}
