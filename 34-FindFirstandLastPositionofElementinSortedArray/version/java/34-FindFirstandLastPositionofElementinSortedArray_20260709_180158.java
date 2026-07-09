// Last updated: 09/07/2026, 18:01:58
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int ans = nums.length;
4        int low = 0;
5        int high = ans -1;
6        while(low <= high){
7            int mid = low + (high - low)/2;
8            if(nums[mid] >= target)
9            {
10                ans = mid ;
11                high = mid -1;
12            } else{
13                low = mid + 1;
14            }
15        }
16        return ans;
17    }
18}