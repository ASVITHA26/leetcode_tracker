// Last updated: 09/07/2026, 18:21:57
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r)
         {
            int wid = r - l;
            int minh = Math.min(height[l], height[r]);
            int ca = minh * wid;

            if (ca > max)
             {
                max = ca;
            }
            if (height[l] < height[r])
            {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}