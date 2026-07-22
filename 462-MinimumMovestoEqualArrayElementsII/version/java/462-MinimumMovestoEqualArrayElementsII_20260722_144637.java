// Last updated: 22/07/2026, 14:46:37
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int sum = 0;
4
5        for (int i = 0; i < k; i++) {
6            sum += cardPoints[i];
7        }
8
9        int max = sum;
10
11        for (int i = 1; i <= k; i++) {
12            sum = sum - cardPoints[k - i] + cardPoints[cardPoints.length - i];
13            max = Math.max(max, sum);
14        }
15
16        return max;
17    }
18}