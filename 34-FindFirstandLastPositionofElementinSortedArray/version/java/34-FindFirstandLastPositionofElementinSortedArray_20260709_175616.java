// Last updated: 09/07/2026, 17:56:16
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int size = digits.length;
4        for(int i = size - 1; i >= 0; i--){
5            if (digits[i] < 9){
6                digits[i]++;
7                return digits;
8            }
9            digits[i] = 0;
10        }
11        digits  = new int[size + 1];
12        digits [0] = 1;
13        return digits;
14    }
15}