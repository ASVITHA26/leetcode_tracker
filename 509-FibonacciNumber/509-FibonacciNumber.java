// Last updated: 12/09/2026, 09:37:49
class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fib(n - 1);
        int sLast = fib(n - 2);
        return last + sLast;
    }
}