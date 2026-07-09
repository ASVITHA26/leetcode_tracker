// Last updated: 09/07/2026, 18:23:28
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5
6        answer[0] = 1;
7        for (int i = 1; i < n; i++) {
8            answer[i] = answer[i - 1] * nums[i - 1];
9        }
10        int suffix = 1;
11        for (int i = n - 1; i >= 0; i--) {
12            answer[i] *= suffix;
13            suffix *= nums[i];
14        }
15
16        return answer;
17    }
18}