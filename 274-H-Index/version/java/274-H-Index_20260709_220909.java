// Last updated: 09/07/2026, 22:09:09
1import java.util.Arrays;
2class Solution {
3    public int hIndex(int[] citations) {
4        Arrays.sort(citations);
5        int n = citations.length;
6        for (int i = 0; i < n; i++) {
7            int h = n - i; 
8            if (citations[i] >= h) {
9                return h;
10            }
11        }
12        return 0;
13    }
14}