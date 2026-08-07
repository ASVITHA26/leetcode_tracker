// Last updated: 07/08/2026, 11:53:29
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2) return 0;
4        boolean[] isPrime = new boolean[n];
5        for (int i = 2; i < n; i++) {
6            isPrime[i] = true;
7        }
8        for (int i = 2; i * i < n; i++) {
9            if (isPrime[i]) {
10                for (int j = i * i; j < n; j += i) {
11                    isPrime[j] = false;
12                }
13            }
14        }
15        int count = 0;
16        for (int i = 2; i < n; i++) {
17            if (isPrime[i]) count++;
18        }
19
20        return count;
21    }
22}