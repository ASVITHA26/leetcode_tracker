// Last updated: 02/09/2026, 09:48:15
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxWindowSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxWindowSum = Math.max(maxWindowSum, sum);
        }
        return maxWindowSum / k;
    }
}
