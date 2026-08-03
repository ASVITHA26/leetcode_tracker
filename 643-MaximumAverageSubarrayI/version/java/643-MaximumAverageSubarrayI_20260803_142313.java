// Last updated: 03/08/2026, 14:23:13
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double sum = 0;
4        for (int i = 0; i < k; i++) {
5            sum += nums[i];
6        }
7        double maxWindowSum = sum;
8        for (int i = k; i < nums.length; i++) {
9            sum += nums[i] - nums[i - k];
10            maxWindowSum = Math.max(maxWindowSum, sum);
11        }
12        return maxWindowSum / k;
13    }
14}
15