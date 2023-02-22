public class BestTimeStockII{
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        boolean sorted = true;
        for(int i = 1;i < prices.length;i++){
            if(prices[i] <= prices[i-1]){
                profit += (prices[i-1] - buy);
                buy = prices[i]; 
                sorted = false;
            }
            else
                buy = Math.min(buy, prices[i]);
        }
        if(sorted)
            profit = prices[prices.length - 1] - buy;
        else if(buy < prices[prices.length - 1]){
            profit += prices[prices.length - 1] - buy;
        }
        return profit;
    }
}