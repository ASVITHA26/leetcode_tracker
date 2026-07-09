// Last updated: 09/07/2026, 18:26:47
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        Arrays.sort(nums); 
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            if (i > 0 && nums[i] == nums[i - 1]) continue;
13
14            int left = i + 1;
15            int right = nums.length - 1;
16
17            while (left < right) {
18
19                int sum = nums[i] + nums[left] + nums[right];
20
21                if (sum == 0) {
22
23                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
24
25                    left++;
26                    right--;
27
28                    while (left < right && nums[left] == nums[left - 1]) left++;
29
30                    while (left < right && nums[right] == nums[right + 1]) right--;
31
32                } 
33                else if (sum < 0) {
34                    left++;   
35                } 
36                else {
37                    right--;  
38                }
39            }
40        }
41
42        return result;
43    }
44}