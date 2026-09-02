// Last updated: 02/09/2026, 09:49:34
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> map = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
            long current = nums[i];
            Long value = map.ceiling(current - (long) valueDiff);
            if (value != null && value <= current + (long) valueDiff) {
                return true;
            }
            map.add(current);
            if (i >= indexDiff) {
                map.remove((long) nums[i - indexDiff]);
            }   
        }
        return false;
    }
}