// Last updated: 10/07/2026, 11:55:28
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int curP = prices[0];
5        int maxP = 0;
6        for(int i=1;i<n;i++){
7        if(prices[i]<curP) curP=prices[i];
8        int profit=prices[i]-curP;
9       if(profit>maxP) maxP=profit;
10        }
11      return maxP;
12    }
13}