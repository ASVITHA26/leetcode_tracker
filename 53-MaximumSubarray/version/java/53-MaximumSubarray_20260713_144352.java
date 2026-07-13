// Last updated: 13/07/2026, 14:43:52
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = nums[0];
4        int currentSum = nums[0];
5        for (int i = 1; i < nums.length; i++) {
6            currentSum = Math.max(nums[i], currentSum + nums[i]);
7            maxSum = Math.max(maxSum, currentSum);
8        } 
9        return maxSum;
10    }
11}