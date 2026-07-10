// Last updated: 10/07/2026, 12:33:50
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int curP = prices[0];
        int maxP = 0;
        for(int i=1;i<n;i++){
        if(prices[i]<curP) curP=prices[i];
        int profit=prices[i]-curP;
       if(profit>maxP) maxP=profit;
        }
      return maxP;
    }
}