// Last updated: 23/07/2026, 14:58:21
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int total = 0;
4        for (int num : nums) {
5            total += num;
6        }
7        int target = total - x;
8        if (target < 0)
9            return -1;
10        if (target == 0)
11            return nums.length;
12        int left = 0;
13        int sum = 0;
14        int maxLength = -1;
15        for (int right = 0; right < nums.length; right++) {
16            sum += nums[right];
17            while (sum > target) {
18                sum -= nums[left];
19                left++;
20            }
21            if (sum == target) {
22                maxLength = Math.max(maxLength, right - left + 1);
23            }
24        }
25        if (maxLength == -1)
26            return -1;
27        return nums.length - maxLength;
28    }
29}