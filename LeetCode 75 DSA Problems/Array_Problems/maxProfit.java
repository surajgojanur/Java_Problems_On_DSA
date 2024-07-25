class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]<buy){
                buy=prices[i+1];
            }
            else if(prices[i+1]-buy > profit){
                profit=prices[i+1]-buy;
            }
        }
        return profit;
    }
}