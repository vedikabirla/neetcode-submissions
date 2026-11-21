class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int buyDay = 0;
        int sellDay = 1;
        int maxProfit = 0;
        while(sellDay < prices.length) {
            if(prices[buyDay] > prices[sellDay]) {
                buyDay = sellDay;
            } else {
                maxProfit = Math.max(maxProfit, prices[sellDay] - prices[buyDay]);
            }
            sellDay++;

        }
        return maxProfit;
        
    }
}
