// Last updated: 16/07/2026, 11:51:42
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int ans = 0;
4        long dist = Long.MAX_VALUE;
5        Arrays.sort(nums);
6        for (int i = 0; i < nums.length; i++) {
7            if (i > 0 && nums[i] == nums[i - 1]) {
8                continue;
9            }
10            int j = i + 1;
11            int k = nums.length - 1;
12            while (j < k) {
13                int sum = nums[i] + nums[j] + nums[k];
14                long newDist = Math.abs(target - sum);
15                if(newDist < dist){
16                    dist = newDist;
17                    ans = sum;
18                }
19                if (sum < target) {
20                    j++;
21                }
22                 else if (sum > target) {
23                    k--;
24                }
25                 else {
26                    return sum;
27                }
28            }
29        }
30        return ans;
31    }
32}