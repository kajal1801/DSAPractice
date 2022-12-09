import java.util.Arrays;

public class FourDigits {
    public static void main(String[] args) {
        int num = 3479;
        int[] arr = new int[4];
        for(int i = 0;i < 4;i++){
            arr[i] = num%10;
            num/=10;
        }
        Arrays.sort(arr);

        int minSum = (arr[0]*10 + arr[3]) + (arr[1]*10 + arr[2]);

        System.out.println(minSum);
    }
}
