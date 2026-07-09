// Last updated: 09/07/2026, 18:13:01
1class Solution {
2    public int maxArea(int[] height) {
3        int l = 0;
4        int r = height.length - 1;
5        int max = 0;
6
7        while (l < r)
8         {
9            int wid = r - l;
10            int minh = Math.min(height[l], height[r]);
11            int ca = minh * wid;
12
13            if (ca > max)
14             {
15                max = ca;
16            }
17            if (height[l] < height[r])
18            {
19                l++;
20            } else {
21                r--;
22            }
23        }
24
25        return max;
26    }
27}