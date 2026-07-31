// Last updated: 31/07/2026, 14:51:37
1public class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        for (int i = 1; i <= n; i++) {
6            ans = ans ^ i;
7        }
8        for (int i = 0; i < nums.length; i++) {
9            ans = ans ^ nums[i];
10        }
11        return ans;
12    }
13}
14