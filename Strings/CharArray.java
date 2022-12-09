import java.util.Arrays;
import java.util.Collections;

public class CharArray {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[0] = "c";
        arr[1] = "t";
        arr[2] = "e";
        arr[3] = "h";

        Arrays.sort(arr, Collections.reverseOrder());

        for (String c : arr) {
            System.out.println(c);
        }
    }
}
