public class CountInversions {
    static long merge(long arr[],long temp[],int left,int mid,int right)
    {
        long inv_count=0;
        int i = left;
        int j = mid;
        int k = left;
        while((i <= mid-1) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }
    
        while(i <= mid - 1)
            temp[k++] = arr[i++];
    
        while(j <= right)
            temp[k++] = arr[j++];
    
        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];
        
        return inv_count;
    }

    static long mergesort(long arr[],long temp[],int left,int right)
    {
        int mid;
        long inv_count = 0;
        if(right > left)
        {
            mid = (left + right)/2;
    
            inv_count += mergesort(arr,temp,left,mid);
            inv_count += mergesort(arr,temp,mid+1,right);
    
            inv_count += merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }

    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long count = 0;
        long temp[] = new long[arr.length];
        count = mergesort(arr, temp, 0, arr.length-1);
        return count;
    }
}
