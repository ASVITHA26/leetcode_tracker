// Last updated: 24/08/2026, 17:55:02
1class Solution {
2    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
3        TreeSet<Long> map = new TreeSet<>();
4        for(int i=0; i<nums.length; i++){
5            long current = nums[i];
6            Long value = map.ceiling(current - (long) valueDiff);
7            if (value != null && value <= current + (long) valueDiff) {
8                return true;
9            }
10            map.add(current);
11            if (i >= indexDiff) {
12                map.remove((long) nums[i - indexDiff]);
13            }   
14        }
15        return false;
16    }
17}