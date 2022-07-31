import java.util.ArrayList;

class CommonEle3Arrays
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int p1 = 0, p2 = 0, p3 = 0;
        while(p1 < n1 && p2 < n2 && p3 < n3){
            if(A[p1] == B[p2] && A[p1] == C[p3]){
                if(!list.contains(A[p1]))
                    list.add(A[p1]);
                p1++;
                p2++;
                p3++;
            }
            else if(A[p1] < B[p2]){
                p1++;
            }
            else if(B[p2] < C[p3]){
                p2++;
            }
            else{
                p3++;
            }
        }
        return list;
    }
}