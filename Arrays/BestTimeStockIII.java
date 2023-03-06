public class BestTimeStockIII{
    public static int maxProfit(int[] prices) {
        int profit1 = 0;
        int profit2 = 0;
        int buy = prices[0];
        boolean sorted = true, prev = false;
        for(int i = 1;i < prices.length;i++){
            if(prices[i] < prices[i-1]){
                if(!prev && profit1 < prices[i-1] - buy || prices[i-1] - buy < profit2 ){
                    profit1 = prices[i-1] - buy;
                    prev = true;
                }
                else if(profit2 < prices[i-1] - buy){
                    profit2 = prices[i-1] - buy;
                    prev = false;
                }
                buy = prices[i];
                sorted = false;
            }
            else{
                buy = Math.min(buy, prices[i]);
            }
        }
        if(sorted){
            profit1 = prices[prices.length - 1] - prices[0];
        }
        return profit1 + profit2;
    }
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }
}