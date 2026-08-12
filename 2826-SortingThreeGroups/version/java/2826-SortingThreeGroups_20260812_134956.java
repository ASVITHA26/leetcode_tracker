// Last updated: 12/08/2026, 13:49:56
1class Solution {
2        public int minimumOperations(List<Integer> A) {
3        int a = 0, b = 0, c = 0;
4        for (int x: A) {
5            a += x == 1 ? 0 : 1;
6            b = Math.min(a, b + (x == 2 ? 0 : 1));
7            c = Math.min(b, c + (x == 3 ? 0 : 1));
8        }
9        return c;
10    }
11}