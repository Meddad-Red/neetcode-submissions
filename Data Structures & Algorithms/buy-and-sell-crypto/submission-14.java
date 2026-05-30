class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = prices.length - 1;

        int maxSell = prices[right];
        int minBuy = prices[left];
        int profit = 0;

        for(int i=0; i<prices.length-1;i++) {
            minBuy = Math.min(minBuy,Math.min(prices[i],prices[i+1]));
            profit = Math.max(profit,prices[i+1]-minBuy);
        }

        if(profit<0){
            return 0;
        }

        return profit;
    }
}
