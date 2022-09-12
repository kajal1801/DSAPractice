import java.util.Arrays;

public class BagOfTokens{
    public static int bagOfTokensScore(int[] tokens, int power) {
        int score = 0, currscore = 0;
        if(tokens.length == 1){
            if(tokens[0] < power){
                return 1;
            }
            else{
                return 0;
            }
        }
        Arrays.sort(tokens);
        int l = 0, r = tokens.length - 1;
        while(l < r){
            while(tokens[l] <= power){
                power -= tokens[l++];
                currscore++;
            }
            score = Math.max(score, currscore);
            
            while(tokens[r] > power && score > 0){
                power += tokens[r--];
                currscore--;
            }
            
            if(l == 0 && r == tokens.length -1){
                break;
            }
        }
        return score;
    }

    public static void main(String args[]){
        int[] tokens = {43, 61, 92};
        int power = 97;
        int ans = bagOfTokensScore(tokens, power);
        System.out.println(ans);
    }
}