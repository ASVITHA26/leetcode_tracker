// Last updated: 02/09/2026, 09:54:08
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int target = 1;
        for (int n : nums) {
            if (n > 0 && n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }

        return target;
    }
}