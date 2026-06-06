class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }

        int buyMin = prices[0];    
        int maxProfit=0;

        for(int right=1; right<prices.length;right++){           
          
            buyMin = Math.min(buyMin,prices[right]);
            maxProfit = Math.max(maxProfit,prices[right]-buyMin);
        }

        if(maxProfit<0){
            return 0;
        }

        return maxProfit;
    }
}
