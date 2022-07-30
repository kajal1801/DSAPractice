public class BestTimeStock {
    public static int bestTime(int prices[]){
        int profit = 0, initial = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length; i++){
            initial = Math.min(initial, prices[i]);
            profit = Math.max(profit, prices[i] - initial);
        }
        return profit;
    }
}
