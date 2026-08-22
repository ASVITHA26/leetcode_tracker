// Last updated: 22/08/2026, 11:09:22
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int m = dungeon.length, n = dungeon[0].length;
4        int[] dp = new int[n + 1];
5        Arrays.fill(dp, Integer.MAX_VALUE);
6        dp[n - 1] = 1; 
7        for (int i = m - 1; i >= 0; i--) {
8            int[] newDp = new int[n + 1];
9            Arrays.fill(newDp, Integer.MAX_VALUE);
10            for (int j = n - 1; j >= 0; j--) {
11                int bestNext;
12                if (i == m - 1 && j == n - 1) {
13                    newDp[j] = Math.max(1, 1 - dungeon[i][j]);
14                    continue;
15                }
16                bestNext = Math.min(
17                    newDp[j + 1] == Integer.MAX_VALUE ? Integer.MAX_VALUE : newDp[j + 1],
18                    dp[j] == Integer.MAX_VALUE ? Integer.MAX_VALUE : dp[j]
19                );
20                newDp[j] = Math.max(1, bestNext - dungeon[i][j]);
21            }
22            dp = newDp;
23        }
24        return dp[0];
25    }
26}