// Last updated: 09/07/2026, 18:10:37
1class Solution {
2    public int longestConsecutive(int[] nums) 
3    {    
4        int n = nums.length;
5        if (n == 0)
6        return 0;
7       Arrays.sort(nums);
8        int l = 1; 
9        int c = 1;
10        for (int i = 1; i < n; i++)
11        {
12            if (nums[i] != nums[i - 1])
13            { 
14                if (nums[i] == nums[i - 1] + 1) 
15                    c++;
16                 else 
17                {
18                    l = Math.max(l, c);
19                    c = 1;
20                }
21                
22            }
23        }
24        int ans = Math.max(l, c);
25        return ans;
26    }
27}