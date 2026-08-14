// Last updated: 14/08/2026, 11:21:14
1class Solution {
2    public int maximumGap(int[] nums) {
3        int n = nums.length;
4        if (n < 2) return 0;
5        int min = nums[0];
6        int max = nums[0];
7        for (int x : nums) {
8            min = Math.min(min, x);
9            max = Math.max(max, x);
10        }
11        if (min == max) return 0;
12        int bucketSize = Math.max(1, (max - min) / (n - 1));
13        int bucketCount = (max - min) / bucketSize + 1;
14        int[] bucketMin = new int[bucketCount];
15        int[] bucketMax = new int[bucketCount];
16        boolean[] used = new boolean[bucketCount];
17        Arrays.fill(bucketMin, Integer.MAX_VALUE);
18        Arrays.fill(bucketMax, Integer.MIN_VALUE);
19        for (int x : nums) {
20            int idx = (x - min) / bucketSize;
21            bucketMin[idx] = Math.min(bucketMin[idx], x);
22            bucketMax[idx] = Math.max(bucketMax[idx], x);
23            used[idx] = true;
24        }
25        int ans = 0;
26        int prev = min;
27        for (int i = 0; i < bucketCount; i++) {
28            if (!used[i]) continue;
29            ans = Math.max(ans, bucketMin[i] - prev);
30            prev = bucketMax[i];
31        }
32        return ans;
33    }
34}