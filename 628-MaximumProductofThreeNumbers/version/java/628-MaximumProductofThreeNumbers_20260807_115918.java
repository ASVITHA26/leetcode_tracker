// Last updated: 07/08/2026, 11:59:18
1class Solution {
2    public int maximumProduct(int[] A) {
3        Arrays.sort(A);
4        int n = A.length;        
5        return Math.max(
6            A[n - 1] * A[n - 2] * A[n - 3],
7            A[n - 1] * A[0] * A[1]
8        );
9    }
10}