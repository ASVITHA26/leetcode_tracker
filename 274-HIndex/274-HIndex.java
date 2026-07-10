// Last updated: 10/07/2026, 12:33:32
import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i; 
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}