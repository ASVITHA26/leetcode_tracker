// Last updated: 12/09/2026, 09:38:42
class Solution {
public:
    int trailingZeroes(int n) {
        if (n < 0) return -1;
        else if (n == 0) return 0;

        int count = 0;

        while (n >= 5) {
            count += n / 5;
            n = n / 5;
        }

        return count;
    }
};