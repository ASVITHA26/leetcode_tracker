// Last updated: 16/07/2026, 16:12:11
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 3) return n;
4      int prev1 = 3;
5        int prev2 = 2;
6        int cur = 0;
7        for (int i = 3; i < n; i++) {
8            cur = prev1 + prev2;
9            prev2 = prev1;
10            prev1 = cur;
11        }
12        return cur;        
13    }
14}