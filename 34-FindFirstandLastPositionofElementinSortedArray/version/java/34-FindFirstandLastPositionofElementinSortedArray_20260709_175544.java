// Last updated: 09/07/2026, 17:55:44
1import java.util.Arrays;
2class Solution {
3    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
4        int n = nums1.length;
5        int m = nums2.length;
6        int[] merged = new int[n + m];
7        int k = 0;
8        for (int i = 0; i < n; i++) {
9            merged[k++] = nums1[i];
10        }
11        for (int i = 0; i < m; i++) {
12            merged[k++] = nums2[i];
13        }
14        Arrays.sort(merged);
15        int total = merged.length;
16        if (total % 2 == 1) {
17            return (double) merged[total / 2];
18        } else {
19            int middle1 = merged[total / 2 - 1];
20            int middle2 = merged[total / 2];
21            return ((double) middle1 + (double) middle2) / 2.0;
22        }
23    }
24}