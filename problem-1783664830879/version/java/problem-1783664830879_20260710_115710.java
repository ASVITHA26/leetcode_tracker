// Last updated: 10/07/2026, 11:57:10
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        return nums[n/2];
6
7    }
8}