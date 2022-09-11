import java.util.ArrayList;

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < n - 1;i++){
            int small = arr.get(i);
            int j = i + 1;
            while(j < n && small < arr.get(j)){
                j++;
            }
            if(j < n)
                small = arr.get(j);
            if(small == arr.get(i)){
                list.add(-1);
            }
            else{
                list.add(small);
            }
        }
        list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = nextSmallerElement(arr, arr.size());
        for (Integer integer : list) {
            System.out.println(integer + " ");
        }
    }
}
