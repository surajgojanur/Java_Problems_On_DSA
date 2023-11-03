class Solution {
    public int maxProfit(int[] prices) {
        int tn=0;
        for (int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                tn+=prices[i]+prices[i+1];
                return tn;
            }
        }
        return tn;
        
    }
}