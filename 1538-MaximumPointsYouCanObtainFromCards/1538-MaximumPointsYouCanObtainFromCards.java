// Last updated: 02/09/2026, 09:47:49
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int max = sum;

        for (int i = 1; i <= k; i++) {
            sum = sum - cardPoints[k - i] + cardPoints[cardPoints.length - i];
            max = Math.max(max, sum);
        }

        return max;
    }
}