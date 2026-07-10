// Last updated: 10/07/2026, 12:33:41
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];

    }
}