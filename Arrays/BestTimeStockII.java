public class BestTimeStockII{
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1;i < prices.length;i++){
            if(prices[i] <= prices[i-1]){ 
                // if the previous element is greater than the current one then we should sell the stock we bought and make the current one our new buy
                profit += (prices[i-1] - buy);
                buy = prices[i]; 
            }
            else
                buy = Math.min(buy, prices[i]); // If the previous stock is not greater than the current stock then we check and store the minimum of buy and current
        }

        if(buy < prices[prices.length - 1]) // In case the elements from the ith position till the end are sorted then that profit won't be added to the profit so we have to do it separately
            profit += prices[prices.length - 1] - buy;
        return profit;
    }
}