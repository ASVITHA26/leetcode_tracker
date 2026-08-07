// Last updated: 07/08/2026, 12:02:11
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4        for (int i = 0; i < nums.length; i++) {
5            if (set.contains(nums[i])) return true;
6            set.add(nums[i]);
7            if (set.size() > k) set.remove(nums[i - k]);
8        }
9        return false;
10    }
11}