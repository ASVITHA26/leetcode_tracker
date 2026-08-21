// Last updated: 21/08/2026, 11:30:35
1class Solution {
2    public boolean solve(String s1, String s2, String s3, int ind1, int ind2, int[][] dp) {
3        if (ind1 + ind2 == s3.length()) return true;
4        if (dp[ind1][ind2] != -1) return dp[ind1][ind2] == 1;
5        boolean ans = false;
6        if (ind1 < s1.length() && s1.charAt(ind1) == s3.charAt(ind1 + ind2)) {
7            ans |= solve(s1, s2, s3, ind1 + 1, ind2, dp);
8        }
9        if (ind2 < s2.length() && s2.charAt(ind2) == s3.charAt(ind1 + ind2)) {
10            ans |= solve(s1, s2, s3, ind1, ind2 + 1, dp);
11        }
12        dp[ind1][ind2] = ans ? 1 : 0;
13        return ans;
14    }
15    public boolean isInterleave(String s1, String s2, String s3) {
16        if (s1.length() + s2.length() != s3.length()) {
17            return false;
18        }
19        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
20        for (int i = 0; i <= s1.length(); i++) {
21            Arrays.fill(dp[i], -1);
22        }
23        return solve(s1, s2, s3, 0, 0, dp);
24    }
25}