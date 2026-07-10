// Last updated: 10/07/2026, 12:38:36
1class Solution {
2    public int countSubstrings(String S) {
3        int len = S.length(), ans = 0;
4        for (int i = 0; i < len; i++) {
5            int j = i - 1, k = i;
6            while (k < len - 1 && S.charAt(k) == S.charAt(k+1)) k++;
7            ans += (k - j) * (k - j + 1) / 2;
8            i = k++;
9            while (j >= 0 && k < len && S.charAt(k++) == S.charAt(j--)) ans++;
10        }
11        return ans;
12    }
13}