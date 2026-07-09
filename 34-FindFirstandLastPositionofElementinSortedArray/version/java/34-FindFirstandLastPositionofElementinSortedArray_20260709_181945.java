// Last updated: 09/07/2026, 18:19:45
1class Solution {
2    public int jump(int[] nums) {
3        int n = 0, f = 0, j = 0;
4
5        while (f < nums.length - 1) {
6            int farthest = 0;
7            for (int i = n; i <= f; i++) {
8                farthest = Math.max(farthest, i + nums[i]);
9            }
10            n = f + 1;
11            f = farthest;
12            j++;
13        }
14
15        return j;        
16    }
17}