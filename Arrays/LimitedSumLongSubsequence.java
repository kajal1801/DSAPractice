import java.util.Arrays;

public class LimitedSumLongSubsequence {
    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = queries.length;
        int sum = 0, ans = Integer.MIN_VALUE;
        int[] res = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            ans = Integer.MIN_VALUE;
            sum = 0;
            int len = 0;
            for (j = 0; j < n; j++) {
                if (sum + nums[j] <= queries[i]) {
                    sum += nums[j];
                    len++;
                }
            }
            ans = Math.max(ans, len);
            res[i] = ans;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {469781,45635,628818,324948,343772,713803,452081};
        int queries[] = {816646,929491};

        int[] res = answerQueries(nums, queries);
        for (int i : res) {
            System.out.println(i + " ");
        }
    }

}
