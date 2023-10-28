class Solution {
    public int maxProfit(int[] prices) {
        //Initialize profit as 0
        int profit = 0;
        //Initialize Buy Price as Day 1 price
        int bp = prices[0];
        for(int i=0; i < prices.length; i++){
            //If the next day price comes down then change the bp to low bp else if bp - latest price is > profit then chage the profit
            if(prices[i] < bp){
                bp = prices[i];
            }else if (prices[i] - bp > profit){
                profit = prices[i] - bp;
            }
        }
        return profit;
    }
}