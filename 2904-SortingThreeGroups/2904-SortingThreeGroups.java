// Last updated: 02/09/2026, 09:47:39
class Solution {
        public int minimumOperations(List<Integer> A) {
        int a = 0, b = 0, c = 0;
        for (int x: A) {
            a += x == 1 ? 0 : 1;
            b = Math.min(a, b + (x == 2 ? 0 : 1));
            c = Math.min(b, c + (x == 3 ? 0 : 1));
        }
        return c;
    }
}