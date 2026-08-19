// Last updated: 19/08/2026, 15:16:37
1class Solution {
2    public int fib(int n) {
3        if (n <= 1) {
4            return n;
5        }
6        int last = fib(n - 1);
7        int sLast = fib(n - 2);
8        return last + sLast;
9    }
10}