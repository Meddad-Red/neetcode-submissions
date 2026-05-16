class Solution {
    public int maxProfit(int[] prices) {
        int currentDay = 0;
        int currentPrice = prices[0];
        int profit = 0;

        int minBuy=prices[0];


        //Time can only go left to right --->
        for(int i=1;i<prices.length;i++){           

            minBuy = Math.min(minBuy, prices[i]);
            //System.out.println(minBuy);
            profit = Math.max(profit, prices[i]-minBuy);
            System.out.println(profit);
        }

        if(profit<0){
            return 0;
        }

        return profit;
    }
}
