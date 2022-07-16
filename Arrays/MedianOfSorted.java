public class MedianOfSorted
{
    
    public static void main(String args[]){

        int[] nums1 = {1 ,3};
        int[] nums2 = {2, 7};
        int n1 = nums1.length, n2 = nums2.length;
        int mid = (n1+n2)/2;
        double ans = 0, add = 0;
        int i = 0, j = 0, prev = 0, f = 0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                if(mid == 0)
                {
                    if((n1+n2) % 2 == 0){
                        add = Double.valueOf(nums1[i] + prev);
                        ans = add/2;
                    }
                    else{
                        ans = nums1[i];
                    }
                    f = 1;
                    break;
                }
                prev = nums1[i];
                mid--;
                i++;
            }
            else if(nums1[i] > nums2[j]){
                if(mid == 0)
                {
                    if((n1+n2) % 2 == 0){
                        add = Double.valueOf(nums2[j] + prev);
                        ans = add/2;
                    }
                    else{
                        ans = nums2[j];
                    }
                    f = 1;
                    break;
                }
                prev = nums2[j];
                mid--;
                j++;
            }
        }
        if(f == 0){
            while(i < n1){
                if(mid == 0){
                    if((n1+n2) % 2 == 0){
                            add = Double.valueOf(nums1[i] + prev);
                            ans = add/2;
                    }
                    else{
                        ans = nums1[i];
                    }
                    f = 1;
                    break;
                }
                prev = nums1[i];
                mid--;
                i++;
            }
        }
        if(f == 0){
            while(j < n2){
                if(mid == 0)
                {
                    if((n1+n2) % 2 == 0){
                        add = Double.valueOf(nums2[j] + prev);
                        System.out.println(add);
                        ans = add/2;
                    }
                    else{
                        ans = nums2[j];
                    }
                    f = 1;
                    break;
                }
                prev = nums2[j];
                mid--;
                j++;
            }
        }
        System.out.println("The ans is: " + ans);
    }
    
}