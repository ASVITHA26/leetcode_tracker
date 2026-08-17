// Last updated: 17/08/2026, 13:56:56
1class Solution {
2    public int checkRecord(int n) {
3        final int MOD = 1000000007;
4        int[][][] f = new int[n + 1][2][3];
5        f[0] = new int[][] { { 1, 1, 1 }, { 1, 1, 1 } };
6        for (int i = 1; i <= n; i++)
7            for (int j = 0; j < 2; j++)
8                for (int k = 0; k < 3; k++) {
9                    int val = f[i - 1][j][2];
10                    if (j > 0)
11                        val = (val + f[i - 1][j - 1][2]) % MOD;
12                    if (k > 0)
13                        val = (val + f[i - 1][j][k - 1]) % MOD;
14                    f[i][j][k] = val;
15                }
16        return f[n][1][2];
17    }
18}