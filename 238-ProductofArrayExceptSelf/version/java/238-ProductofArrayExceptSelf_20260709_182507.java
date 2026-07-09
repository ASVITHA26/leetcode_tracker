// Last updated: 09/07/2026, 18:25:07
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int sum = 0;
4        for (int i = 1; i <= num / 2; i++) {
5            if (num % i == 0) {
6                sum =sum+ i;
7            }
8        }
9        return sum == num;
10    }
11}